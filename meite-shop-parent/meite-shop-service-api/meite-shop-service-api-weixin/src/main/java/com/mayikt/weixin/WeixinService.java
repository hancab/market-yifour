package com.mayikt.weixin;

import com.weixin.Testwx;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author yifenrui
 * @since 2019/5/18
 */
@Api(tags = "微信服务")
public interface WeixinService {

    @ApiOperation(value = "微信服务接口")
    @GetMapping("/getApp")
    public Testwx getEntity();
}
