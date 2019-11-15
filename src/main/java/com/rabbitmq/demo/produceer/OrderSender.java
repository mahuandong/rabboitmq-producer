package com.rabbitmq.demo.produceer;

import com.rabbitmq.demo.domain.Order;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Enzo Cotter on 2019/11/15.
 */
@Component
public class OrderSender {

    @Resource
    private RabbitTemplate rabbitTemplate;

    public void send(Order order){
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(String.valueOf(order.getMessageId()));
        rabbitTemplate.convertAndSend("order-exchange","order.abcd", order, correlationData);
        /**
         * 还要在 rabbitmq 控制台配置exchange和queue，并绑定
         * 加绑定在控制台的exchange和queues哪一块都可以
         */
    }
}
