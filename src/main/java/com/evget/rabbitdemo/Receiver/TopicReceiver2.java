package com.evget.rabbitdemo.Receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author ：liuhm
 * @date ：Created in 2019/1/23 15:39
 */
@Component
@RabbitListener(queues = "topic.messages")
public class TopicReceiver2 {
    @RabbitHandler
    public void process(String msg) {
        System.out.println("TopicReceiver2 :" + msg);
    }

}
