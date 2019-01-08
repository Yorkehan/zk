package com.yorkehan.zk;

import org.springframework.cloud.context.scope.refresh.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MvcConfig {
    @Bean
    public RefreshScope refreshScope(){
        return new RefreshScope();
    }
}
