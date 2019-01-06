package com.yorkehan.zk.config.DataSource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class DataSourceConfig {

    @Bean
    @RefreshScope
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    @Primary
    public DataSource dataSource(){
        DruidDataSource build = DruidDataSourceBuilder.create().build();
        return build;
    }
}
