package com.mayikt.weixin;

import com.spring4all.swagger.EnableSwagger2Doc;
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
@EnableSwagger2Doc
public class AppWeixin {
    public static void main(String[] args) {
        SpringApplication.run(AppWeixin.class,args);
    }
}
