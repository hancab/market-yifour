package com.mayikt.weixin.service.impl;

import com.mayikt.weixin.WeixinService;
import com.weixin.Testwx;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 为什么这里是controller，因为提供接口不单单是pc端，还有app端
 * </p>
 *
 * @author yifenrui
 * @since 2019/5/18
 */
@RestController
public class WeixinServiceImpl implements WeixinService {

    @Override
    public Testwx getEntity() {
        Testwx testwx = new Testwx();
        testwx.setId("id");
        testwx.setName("name");
        return testwx;
    }
}
