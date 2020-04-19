package com.hub.hubblank.service.impl;

import com.hub.hubblank.service.RegisterService;
import org.springframework.stereotype.Service;

/**
 * @description
 * @author: fuyb
 * @create: 2020-04-18 23:39
 **/
@Service
public class MobileRegisterServiceImpl implements RegisterService {

    @Override
    public String doRegister() {
        return "手机注册";
    }
}
