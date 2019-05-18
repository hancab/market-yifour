package com.mayikt.member.service;

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
@Api(tags = "会员服务接口")
public interface MemberService {

    @ApiOperation("会员服务调用微信服务")
    @GetMapping("/membertoWeixin")
    public Testwx memberToWeixin();
}
