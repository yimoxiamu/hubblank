package com.hub.hubblank;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class HubblankApplication {


    @Bean
    DirectExchange exchange(){
        return new DirectExchange("exchange");
    }

    @Bean
    public Queue repeatTradeQueue(){
        Queue queue = new Queue("repeatTradeQueue",true,false,false);
        return queue;
    }

    @Bean
    public Binding repeatTradeBinding() {
        return BindingBuilder.bind(repeatTradeQueue()).to(exchange()).with("repeatTradeQueue");
    }

    @Bean
    public Queue deadQue(){
        Map<String,Object> map = new HashMap<>(16);
        map.put("x-message-ttl",5 * 60 * 1000);
        map.put("x-dead-letter-exchange","exchange");
        map.put("x-dead-letter-routing-key","repeatTradeQueue");
        return new Queue("deadLetterQueue",true,false,false,map);
    }


    public static void main(String[] args) {
        SpringApplication.run(HubblankApplication.class, args);
    }
}
