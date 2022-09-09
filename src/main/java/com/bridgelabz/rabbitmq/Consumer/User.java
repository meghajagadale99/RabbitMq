package com.bridgelabz.rabbitmq.Consumer;

import com.bridgelabz.rabbitmq.Config.MessagingConfig;
import com.bridgelabz.rabbitmq.DTO.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("Message recieved from queue : " + orderStatus);
    }
}