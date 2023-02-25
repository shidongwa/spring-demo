package com.stone.studio.springdemo.lifecycle;

import com.stone.studio.springdemo.service.MySpringBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        if (bean instanceof MySpringBean) {
            System.out.println("---MySpringBean postProcessBeforeInitialization executed ---");
        } else if(bean instanceof InitSequenceBean) {
            System.out.println("---InitSequenceBean postProcessBeforeInitialization executed ---");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        if (bean instanceof MySpringBean) {
            System.out.println("---MySpringBean postProcessAfterInitialization executed ---");
        } else if(bean instanceof InitSequenceBean) {
            System.out.println("---InitSequenceBean postProcessAfterInitialization executed ---");
        }
        return bean;
    }

}
