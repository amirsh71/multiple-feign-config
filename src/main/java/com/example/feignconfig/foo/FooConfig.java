package com.example.feignconfig.foo;

import org.springframework.context.annotation.Bean;

public class FooConfig {

    @Bean
    public FooRequestInterceptor fooRequestInterceptor() {
        return new FooRequestInterceptor();
    }
}
