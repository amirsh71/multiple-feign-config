package com.example.feignconfig.foo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(contextId = "fooContextId", value = "fooValue", url = "http://foo-server.com/services", configuration = FooConfig.class)
public interface FooFeignClient {

    @GetMapping("{id}/foo")
    void getFoo(@PathVariable("id") Long id);
}
