package com.yorkehan.zk.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class PropertiesConfig {
    @Bean
    @RefreshScope
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    @Primary
    public DataSource dataSource(){
        return DruidDataSourceBuilder.create().build();
    }
}
