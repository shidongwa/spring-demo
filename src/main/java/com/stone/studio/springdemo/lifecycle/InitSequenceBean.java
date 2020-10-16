package com.stone.studio.springdemo.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: shidonghua
 * @Description:
 * @Date: 10/16/20 11:38
 * @Version: 1.0
 * https://programmer.help/blogs/after-properties-set-and-init-method-postconstruct-of-spring-initializing-bean.html
 * postConstruct 对应的是BeanPostProcessor的postProcessBeforeInitialization
 * 执行顺序是：Constructor > @PostConstruct > InitializingBean > init-method -> preDestroy -> destroy -> destroy-method
 */
public class InitSequenceBean implements InitializingBean, DisposableBean {

    public InitSequenceBean() {
        System.out.println("InitSequenceBean: constructor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("InitSequenceBean: postConstruct");
    }

    @PreDestroy
    public void preDestory() {
        System.out.println("InitSequenceBean: preDestroy");
    }

    public void initMethod() {
        System.out.println("InitSequenceBean: init-method");
    }

    public void destroyMethod() {
        System.out.println("InitSequenceBean: destroy-method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitSequenceBean: afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("InitSequenceBean: destroy");
    }
}
