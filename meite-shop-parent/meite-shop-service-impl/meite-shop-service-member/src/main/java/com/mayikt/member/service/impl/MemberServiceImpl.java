package com.mayikt.member.service.impl;

import com.mayikt.member.feign.MemberServiceFeign;
import com.mayikt.member.service.MemberService;
import com.weixin.Testwx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 会员服务
 * </p>
 *
 * @author yifenrui
 * @since 2019/5/18
 */

@RestController
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberServiceFeign memberServiceFeign;
    @Override
    public Testwx memberToWeixin() {
        return memberServiceFeign.getEntity();
    }
}
