package com.guludai.data.consumer.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = {ClusterDataSourceConfig.PACKAGE1}, sqlSessionFactoryRef = ClusterDataSourceConfig.NAME + "SqlSessionFactory")
public class ClusterDataSourceConfig {
    @Autowired
    private ClusterDataSourceProperties clusterDataSourceProperties;
    static final String PACKAGE1 = "com.guludai.data.consumer.erp1.v2.mapper";
    //xml目录
    private static final String mapperLocation1 = "classpath:mapper/erp1/v2/*.xml";
    private static final String[] mapperLocations = {mapperLocation1};
    //全局名字前缀
    static final String NAME = "erp1_v2";
    @Bean(name = NAME + "DataSource")
    public DataSource dataSource() {
        String driverClassName = clusterDataSourceProperties.getDriverClassName();
        String url = clusterDataSourceProperties.getUrl();
        String username = clusterDataSourceProperties.getUsername();
        String password = clusterDataSourceProperties.getPassword();
        return MyUtils.getDruidDataSource(driverClassName, url, username, password);
    }
    @Bean(name = NAME + "TransactionManager")
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
    @Bean(name = NAME + "SqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier(NAME + "DataSource") DataSource dataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setMapperLocations(MyUtils.resolveMapperLocations(mapperLocations));
        return sessionFactory.getObject();
    }
}

 