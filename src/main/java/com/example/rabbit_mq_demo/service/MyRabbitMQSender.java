package com.example.rabbit_mq_demo.service;

import com.example.rabbit_mq_demo.model.Employee;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyRabbitMQSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    @Value("${spring.rabbitmq.exchange}")
    private  String exchange;
    @Value("${spring.rabbitmq.routingkey}")
    private String routingKey;

    public void send(Employee data) {
        amqpTemplate.convertAndSend(exchange, routingKey, data);
        System.out.println("Send msg = " + data);
    }
}
