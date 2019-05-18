package com.mayikt.member.feign;

import com.mayikt.weixin.WeixinService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * <p>
 * 会员服务调用微信服务（也是实现类的配置服务名）
 * 然后去微信service接口那里要调用的方法复制过来--这样有缺陷（代码和service的重复了）
 * 所以maven引入要远程的接口工程，直接去继承service里对应的
 * </p>
 *
 * @author yifenrui
 * @since 2019/5/18
 */
@FeignClient("app-mayikt-weixin")
public interface MemberServiceFeign extends WeixinService{
    //代码重复-直接继承
    /*@GetMapping("/getApp")
    public Testwx getEntity();*/
}
