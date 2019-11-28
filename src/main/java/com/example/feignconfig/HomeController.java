package com.example.feignconfig;

import com.example.feignconfig.bar.BarFeignClient;
import com.example.feignconfig.foo.FooFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private FooFeignClient fooFeignClient;
    @Autowired
    private BarFeignClient barFeignClient;

    @GetMapping("test")
    public void home() {
        try {
            LOGGER.info("calling getFoo");
            fooFeignClient.getFoo(100L);
        } catch (Exception e) {
        }

        try {
            LOGGER.info("calling getBar");
            barFeignClient.getBar(100L);
        } catch (Exception e) {
        }
    }
}
