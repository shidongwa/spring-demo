package com.stone.studio.springdemo.service;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class MySpringBean implements BeanNameAware, ApplicationContextAware,
        InitializingBean, DisposableBean {

    private String message;

    public void sendMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("---MySpringBean setBeanName executed ---");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        System.out.println("---MySpringBean setApplicationContext executed ---");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("---MySpringBean @PostConstruct executed ---");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("---MySpringBean afterPropertiesSet executed ---");
    }

    public void initMethod() {
        System.out.println("---MySpringBean init-method executed ---");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("---MySpringBean @PreDestroy executed ---");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("---MySpringBean destroy executed ---");
    }

    public void destroyMethod() {
        System.out.println("--- MySpringBean destroy-method executed ---");
    }
}

