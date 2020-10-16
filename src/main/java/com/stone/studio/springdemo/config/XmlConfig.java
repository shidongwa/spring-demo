package com.stone.studio.springdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author: shidonghua
 * @Description:
 * @Date: 10/16/20 16:01
 * @Version: 1.0
 */
@Configuration
@ImportResource(locations={"classpath:app-config.xml"})
public class XmlConfig {

}
