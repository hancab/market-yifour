package com.mayikt.weixin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author yifenrui
 * @since 2019/5/18
 */
@SpringBootApplication
@EnableEurekaClient
public class AppWeixin {
    public static void main(String[] args) {
        SpringApplication.run(AppWeixin.class,args);
    }
}
