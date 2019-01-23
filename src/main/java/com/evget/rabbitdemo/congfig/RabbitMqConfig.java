package com.evget.rabbitdemo.congfig;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：liuhm
 * @date ：Created in 2019/1/23 14:49
 */
@Configuration
public class RabbitMqConfig {
    @Bean
    public Queue Queue1() {
        return new Queue("lyhTest1");
    }
    @Bean
    public Queue Queue2() {
        return new Queue("lyhTest2");
    }
}