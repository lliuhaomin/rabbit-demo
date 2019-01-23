package com.evget.rabbitdemo.Receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * @author ：liuhm
 * @date ：Created in 2019/1/23 15:38
 */
@Component
@RabbitListener(queues = "topic.message")
public class TopicReceiver1 {
    @RabbitHandler
    public void process(String msg) {
        System.out.println("TopicReceiver1:" + msg);
    }

}
