package com.micro.factory.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class FactoryBeanConfigurator {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
