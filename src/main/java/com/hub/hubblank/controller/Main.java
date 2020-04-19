package com.hub.hubblank.controller;

import com.hub.hubblank.mq.Product;
import com.hub.hubblank.mq.TestProduce;
import com.hub.hubblank.service.RegisterService;
import com.hub.hubblank.service.TestService;
import com.hub.hubblank.service.impl.EmailRegisterServiceImpl;
import com.hub.hubblank.service.impl.MobileRegisterServiceImpl;
import com.hub.hubblank.service.impl.RegisterServiceImpl;
import com.hub.hubblank.test.MyEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ybfu3
 * @description
 * @date Create in 21:00 2020/4/9
 */
@RestController
public class Main {
    @Autowired
    ApplicationContext classPathXmlApplicationContext;
    @Autowired
    TestService testService;
    @Autowired
    Product product;
    @Autowired
    TestProduce testProduce;
    @Autowired
    RegisterServiceImpl registerService;
//    @Autowired
//    List<RegisterService> list;

    @GetMapping(value = "/test")
    public String test(){
        MyEvent myEvent = new MyEvent("good","ming",16);
        classPathXmlApplicationContext.publishEvent(myEvent);

        return testService.getName();
    }

    @GetMapping(value = "/test1")
    public void test2(String msg){
        product.send(msg);
        testProduce.send(msg+"ceshi");
    }

    @GetMapping(value = "/test2")
    public String test3(String type){
        return registerService.executeRegister(type);
    }}
