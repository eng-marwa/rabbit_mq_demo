package com.example.rabbit_mq_demo.controller;

import com.example.rabbit_mq_demo.model.Employee;
import com.example.rabbit_mq_demo.service.MyRabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/api/rabbitmq")
public class MyRabbitMQController {
    @Autowired
    MyRabbitMQSender rabbitMQSender;
    // @Autowired
    // RabbitMQReceiver rabbitMQReceiver;
    // @Autowired
    // RabbitMQReceiver2 rabbitMQReceiver2;
    // @Autowired
    // RabbitMQReceiver3 rabbitMQReceiver3;
    // @Autowired
    // RabbitMQReceiver4 rabbitMQReceiver4;
    // @Autowired
    // RabbitMQReceiver5 rabbitMQReceiver5;
    // @Autowired
    // RabbitMQReceiver6 rabbitMQReceiver6;
    // @Autowired
    // RabbitMQReceiver7 rabbitMQReceiver7;
    // @Autowired
    // RabbitMQReceiver8 rabbitMQReceiver8;
    // @Autowired
    // RabbitMQReceiver9 rabbitMQReceiver9;
    // @Autowired
    // RabbitMQReceiver10 rabbitMQReceiver10;
    // @Autowired
    // RabbitMQReceiver11 rabbitMQReceiver11;
    // @Autowired
    // RabbitMQReceiver12 rabbitMQReceiver12;
    // @Autowired
    // RabbitMQReceiver13 rabbitMQReceiver13;
    // @Autowired
    // RabbitMQReceiver14 rabbitMQReceiver14;
    // @Autowired
    // RabbitMQReceiver15 rabbitMQReceiver15;
    // @Autowired
    // RabbitMQReceiver16 rabbitMQReceiver16;
    // @Autowired
    // RabbitMQReceiver17 rabbitMQReceiver17;
    // @Autowired
    // RabbitMQReceiver18 rabbitMQReceiver18;
    // @Autowired
    // RabbitMQReceiver19 rabbitMQReceiver19;
    // @Autowired
    // RabbitMQReceiver20 rabbitMQReceiver20;
    // @Autowired
    // RabbitMQReceiver21 rabbitMQReceiver21;
    // @Autowired
    // RabbitMQReceiver22 rabbitMQReceiver22;
    // @Autowired
    // RabbitMQReceiver23 rabbitMQReceiver23;
    // @Autowired
    // RabbitMQReceiver24 rabbitMQReceiver24;
    // @Autowired
    // RabbitMQReceiver25 rabbitMQReceiver25;
    // @Autowired
    // RabbitMQReceiver26 rabbitMQReceiver26;
    // @Autowired
    // RabbitMQReceiver27 rabbitMQReceiver27;
    // @Autowired
    // RabbitMQReceiver28 rabbitMQReceiver28;
    // @Autowired
    // RabbitMQReceiver29 rabbitMQReceiver29;
    // @Autowired
    // RabbitMQReceiver30 rabbitMQReceiver30;
    // @Autowired
    //

    @GetMapping(value = "/producer")
    public String producer(@RequestParam("empName") String empName, @RequestParam("empId") String empId) {
        Employee emp=new Employee();
        emp.setEmpId(empId);
        emp.setEmpName(empName);
        rabbitMQSender.send(emp);

        return "Message sent to the RabbitMQ JavaInUse Successfully";
    }
}
