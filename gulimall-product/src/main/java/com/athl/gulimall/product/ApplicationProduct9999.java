package com.athl.gulimall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author hl
 * @Data 2020/7/16
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.athl.gulimall.product.feign")
public class ApplicationProduct9999 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationProduct9999.class, args);
    }
}
