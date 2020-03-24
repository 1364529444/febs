package com.febs.service.febsservicesystem;

import com.febs.common.annotation.EnableFebsAuthExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableDiscoveryClient
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableFebsAuthExceptionHandler
public class FebsServiceSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(FebsServiceSystemApplication.class, args);
    }

}
