package com.example.connectorstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "hello-enabled", havingValue = "true")
public class HelloConfiguration {
    @Bean
    public void helloBean() {
        System.out.println("HELLO FROM STARTER");
    }
}
