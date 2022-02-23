package com.build;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhangcm
 * @date 2022年02月23日 9:35
 */

@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigApplication {
    Logger LOGGER = LoggerFactory.getLogger(NacosConfigApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigApplication.class,args);
    }
}
