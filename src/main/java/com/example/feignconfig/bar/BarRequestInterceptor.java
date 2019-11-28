package com.example.feignconfig.bar;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BarRequestInterceptor implements RequestInterceptor {
    private static final Logger LOGGER = LoggerFactory.getLogger(BarRequestInterceptor.class);

    @Override
    public void apply(RequestTemplate template) {
        template.header("authorization", "auth-bar");
        LOGGER.info("bar authentication applied");
    }
}
