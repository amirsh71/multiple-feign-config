package com.example.feignconfig.bar;

import org.springframework.context.annotation.Bean;

public class BarConfig {

    @Bean
    public BarRequestInterceptor barRequestInterceptor() {
        return new BarRequestInterceptor();
    }
}
