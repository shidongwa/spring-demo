package com.stone.studio.springdemo.config;

import com.stone.studio.springdemo.lifecycle.MyBeanPostProcessor;
import com.stone.studio.springdemo.service.MySpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class MySpringConfiguration {

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor(){
        return new MyBeanPostProcessor();
    }

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public MySpringBean mySpringBean(){
        return new MySpringBean();
    }

}
