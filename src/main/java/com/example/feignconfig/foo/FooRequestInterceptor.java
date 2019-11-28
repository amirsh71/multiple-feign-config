package com.example.feignconfig.foo;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FooRequestInterceptor implements RequestInterceptor {
    private static final Logger LOGGER = LoggerFactory.getLogger(FooRequestInterceptor.class);

    @Override
    public void apply(RequestTemplate template) {
        template.header("authorization", "auth-foo");
        LOGGER.info("foo authentication applied");
    }
}
