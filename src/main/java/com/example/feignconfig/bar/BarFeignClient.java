package com.example.feignconfig.bar;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(contextId = "barContextId", value = "barValue", url = "http://bar-server.com/services", configuration = BarConfig.class)
public interface BarFeignClient {

    @GetMapping("{id}/bar")
    void getBar(@PathVariable("id") Long id);
}
