package com.stone.studio.springdemo;


import com.stone.studio.springdemo.service.MySpringBean;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BeanLifecycleApplicationTests {

    @Autowired
    public MySpringBean mySpringBean;

    @Test
    public void testMySpringBeanLifecycle() {
        String message = "Hello World";
        mySpringBean.sendMessage(message);
        Assertions.assertThat(mySpringBean.getMessage()).isEqualTo(message);
    }

}
