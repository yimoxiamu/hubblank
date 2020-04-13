package com.hub.hubblank.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author ybfu3
 * @description
 * @date Create in 11:17 2020/4/10
 */
@Component
@RabbitListener(queues = "repeatTradeQueue")
public class Listener {

    @RabbitHandler
    public void process(String msg){
        System.out.println("repeatTradeQueue 接收时间:"+ LocalDateTime.now().toString()+" 接收内容:"+msg);
    }

}
