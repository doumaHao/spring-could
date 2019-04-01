package com.douma.spring.could.server.web.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class ServerController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/ping")
    public String ping() throws UnknownHostException {
        InetAddress addr = InetAddress.getLocalHost();
        String ip = addr.getHostAddress();
        String address = addr.getHostName();
        return ip + ":" + port + " - " + address;
    }

}
