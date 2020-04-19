package com.hub.hubblank.service.impl;

import com.hub.hubblank.service.RegisterService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @description
 * @author: fuyb
 * @create: 2020-04-18 23:40
 **/
@Service
public class EmailRegisterServiceImpl implements RegisterService {

    @Override
    public String doRegister() {
        return "邮箱注册";
    }
}
