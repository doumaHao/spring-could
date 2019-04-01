package com.douma.spring.could.client.rest.web;

import com.douma.spring.could.client.feign.ServerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private ServerFeign serverFeign;

    @GetMapping("ping")
    public String clientTest() {
        return serverFeign.ping();
    }

}
