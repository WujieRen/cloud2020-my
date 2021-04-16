package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author rwj
 * @create_time 2021/4/15
 */
@Configuration
public class ApplicationContextConfig {
    //applicationContext.xml <bean id="" class="">
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}