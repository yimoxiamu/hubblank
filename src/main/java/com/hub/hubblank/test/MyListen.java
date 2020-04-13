package com.hub.hubblank.test;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author ybfu3
 * @description
 * @date Create in 20:57 2020/4/9
 */
@Component
public class MyListen implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof MyEvent){
            System.out.println("名称为："+((MyEvent) event).getName());
            System.out.println("年龄为："+((MyEvent) event).getAge());
        }else {
//            System.out.println("此时变化为"+event.getSource());
        }

    }
}
