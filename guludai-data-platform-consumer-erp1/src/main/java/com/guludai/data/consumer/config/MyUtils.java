package com.guludai.data.consumer.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyUtils {
    public static DruidDataSource getDruidDataSource(String driverClassName, String url, String username, String password) {
        DruidDataSource dataSource = new DruidDataSource();
        //这一项可配可不配，如果不配置druid会根据url自动识别dbType，然后选择相应的driverClassName
        dataSource.setDriverClassName(driverClassName);
        //连接数据库的url
        dataSource.setUrl(url);
        //连接数据库的用户名
        dataSource.setUsername(username);
        //连接数据库的密码
        dataSource.setPassword(password);
        //初始化时建立物理连接的个数。初始化发生在显示调用init方法，或者第一次getConnection时
        dataSource.setInitialSize(1);
        //最小连接池数量
        dataSource.setMinIdle(1);
        //最大连接池数量
        dataSource.setMaxActive(20);
        //获取连接时最大等待时间，单位毫秒。配置了maxWait之后，缺省启用公平锁，并发效率会有所下降，如果需要可以通过配置useUnfairLock属性为true使用非公平锁。
        dataSource.setMaxWait(1000);
        return dataSource;
    }
    /**
     * org.mybatis.spring.boot.autoconfigure包下MybatisProperties里面的方法直接拿来用
     *
     * @param mapperLocations xml路径数组
     * @return 资源数组
     */
    public static Resource[] resolveMapperLocations(String[] mapperLocations) {
        ResourcePatternResolver resourceResolver = new PathMatchingResourcePatternResolver();
        List<Resource> resources = new ArrayList<Resource>();
        if (mapperLocations != null) {
            String[] var3 = mapperLocations;
            int var4 = var3.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                String mapperLocation = var3[var5];
                try {
                    Resource[] mappers = resourceResolver.getResources(mapperLocation);
                    resources.addAll(Arrays.asList(mappers));
                } catch (IOException var8) {
                    ;
                }
            }
        }
        return resources.toArray(new Resource[resources.size()]);
    }
}

