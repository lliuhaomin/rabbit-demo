package com.evget.rabbitdemo.Receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author ：liuhm
 * @date ：Created in 2019/1/23 15:30
 */
@Component
@RabbitListener(queues = "lyhTest2")
public class Receiver2 {

    @RabbitHandler
    public void receiver(String msg){
        System.out.println("Test2 receiver2:"+msg);
    }
}
