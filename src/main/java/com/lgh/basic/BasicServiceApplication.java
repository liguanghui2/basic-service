package com.lgh.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liguanghui9105
 */
@EnableDiscoveryClient
@SpringBootApplication
public class BasicServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicServiceApplication.class, args);
    }

}
