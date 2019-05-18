package com.mayikt.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

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
@EnableFeignClients
public class AppMember {
    public static void main(String[] args) {
        SpringApplication.run(AppMember.class,args);
    }
}