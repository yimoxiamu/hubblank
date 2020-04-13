package com.hub.hubblank.service;

import org.springframework.stereotype.Service;

/**
 * @author ybfu3
 * @description
 * @date Create in 21:13 2020/4/9
 */
@Service
public class TestService {
    private static String name;
    public TestService() {
        name = "123";
    }

    public String getName(){
        return name;
    }

}
