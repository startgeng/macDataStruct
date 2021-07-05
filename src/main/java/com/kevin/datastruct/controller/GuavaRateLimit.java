package com.kevin.datastruct.controller;

import com.google.common.util.concurrent.RateLimiter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenligeng
 * guava 缓存限流
 */
@RestController
@Slf4j
public class GuavaRateLimit {

    RateLimiter limiter = RateLimiter.create(2.0);

    @GetMapping(value = "/limterData")
    public String limterData(int count){
        //每次消耗两个通行证
        if (limiter.tryAcquire(count)){
            log.info("ratelimit,{}",limiter.getRate());
            return "success";
        }else {
            log.info("ratelimit,{}",limiter.getRate());
            return "false";
        }
    }
}
