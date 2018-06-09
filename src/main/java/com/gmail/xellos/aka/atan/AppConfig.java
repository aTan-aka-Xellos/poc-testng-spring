package com.gmail.xellos.aka.atan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.gmail.xellos.aka.atan")
public class AppConfig {

    @Bean
    public static BeanBar getBeanBar() {
        return new BeanBar("This is a BeanBar");
    }
}
