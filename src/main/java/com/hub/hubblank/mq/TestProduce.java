package com.hub.hubblank.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ybfu3
 * @description
 * @date Create in 13:36 2020/4/10
 */
@Component
public class TestProduce {
    @Autowired
    AmqpTemplate amqpTemplate;

    public void send(String message){
        amqpTemplate.convertAndSend("repeatTradeQueue",message);
    }
}
