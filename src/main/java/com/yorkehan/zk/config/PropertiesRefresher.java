package com.yorkehan.zk.config;

import com.ctrip.framework.apollo.model.ConfigChange;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import com.yorkehan.zk.config.DataSource.DataSourceConfig;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.cloud.context.scope.refresh.RefreshScope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PropertiesRefresher implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Autowired
    RefreshScope refreshScope;

    @ApolloConfigChangeListener
    public void onChange(ConfigChangeEvent changeEvent){

         for (String changedKey : changeEvent.changedKeys()) {
                 log.info("===============================================================");
                 log.info("changedKey:{} value:{}",changedKey,changeEvent.getChange(changedKey));
                 ConfigChange configChange = changeEvent.getChange(changedKey);
                 configChange.getOldValue();
                 break;

         }
        refreshProperties(changeEvent);
    }

    public void refreshProperties(ConfigChangeEvent changeEvent){
        this.applicationContext.publishEvent(new EnvironmentChangeEvent(changeEvent.changedKeys()));
        refreshScope.refreshAll();
    }

    @Override
    public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
