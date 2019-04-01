package com.douma.spring.could.client.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("COULD-SERVICE")
public interface ServerFeign {

    @GetMapping("/ping")
    String ping();

}
