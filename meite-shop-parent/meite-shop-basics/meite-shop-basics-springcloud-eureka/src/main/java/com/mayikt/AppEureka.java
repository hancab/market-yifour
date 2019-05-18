package com.mayikt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author yifenrui
 * @since 2019/5/18
 */
@SpringBootApplication
@EnableEurekaServer
public class AppEureka {
    public static void main(String[] args) {
        SpringApplication.run(AppEureka.class,args);
    }
}
