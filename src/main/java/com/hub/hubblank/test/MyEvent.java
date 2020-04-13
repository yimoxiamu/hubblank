package com.hub.hubblank.test;

import org.springframework.context.ApplicationEvent;

/**
 * @author ybfu3
 * @description
 * @date Create in 20:55 2020/4/9
 */
public class MyEvent extends ApplicationEvent {

    private String name;
    private int age;

    public MyEvent(Object source, String name, int age) {
        super(source);
        this.name = name;
        this.age = age;
    }

    public MyEvent(Object source) {
        super(source);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
