package com.mayikt.member.service;

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

public interface MemberService {
    @GetMapping("/membertoWeixin")
    public Testwx memberToWeixin();
}
