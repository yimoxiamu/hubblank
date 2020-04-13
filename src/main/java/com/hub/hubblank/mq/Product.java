package com.hub.hubblank.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author ybfu3
 * @description
 * @date Create in 11:15 2020/4/10
 */
@Component
public class Product {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(String msg){
        System.out.println("DeadLetterSender 发送时间:"+ LocalDateTime.now().toString()+" msg内容："+msg);
        amqpTemplate.convertAndSend("deadLetterQueue", msg);
    }
}
