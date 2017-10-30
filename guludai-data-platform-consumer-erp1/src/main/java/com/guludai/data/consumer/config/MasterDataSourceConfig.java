package com.guludai.data.consumer.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
// 扫描 Mapper 接口并容器管理
@MapperScan(basePackages = {MasterDataSourceConfig.PACKAGE1}, sqlSessionFactoryRef = MasterDataSourceConfig.NAME + "SqlSessionFactory")
public class MasterDataSourceConfig {
    @Autowired
    private MasterDataSourceProperties masterDataSourceProperties;
    // 精确到 master 目录，以便跟其他数据源隔离
    //dao目录
    static final String PACKAGE1 = "com.guludai.data.consumer.erp1.v1.mapper";
    //xml目录
    private static final String mapperLocation1 = "classpath:mapper/erp1/v1/*.xml";
    private static final String[] mapperLocations = {mapperLocation1};
    //全局名字前缀
    static final String NAME = "erp1_v1";
    //数据源
    @Bean(name = NAME + "DataSource")
    @Primary
    public DataSource dataSource() {
        String driverClassName = masterDataSourceProperties.getDriverClassName();
        String url = masterDataSourceProperties.getUrl();
        String username = masterDataSourceProperties.getUsername();
        String password = masterDataSourceProperties.getPassword();
        return MyUtils.getDruidDataSource(driverClassName, url, username, password);
    }
    //事务管理器
    @Bean(name = NAME + "TransactionManager")
    @Primary
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
    //工厂
    @Bean(name = NAME + "SqlSessionFactory")
    @Primary
    public SqlSessionFactory sqlSessionFactory(@Qualifier(NAME + "DataSource") DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setMapperLocations(MyUtils.resolveMapperLocations(mapperLocations));
        return sessionFactory.getObject();
    }
}
 