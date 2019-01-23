package com.evget.rabbitdemo.Receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author ：liuhm
 * @date ：Created in 2019/1/23 14:51
 */
@Component
@RabbitListener(queues = "lyhTest1")
public class Receiver1 {

    @RabbitHandler
    public void receiver(String msg){
        System.out.println("Test1 receiver1:"+msg);
    }
}