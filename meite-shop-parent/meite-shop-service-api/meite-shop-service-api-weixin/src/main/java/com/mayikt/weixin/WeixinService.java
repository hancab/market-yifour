package com.mayikt.weixin;

import com.weixin.Testwx;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author yifenrui
 * @since 2019/5/18
 */
public interface WeixinService {

    @GetMapping("/getApp")
    public Testwx getEntity();
}
