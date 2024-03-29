package com.example.rabbit_mq_demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String empName;
    private String empId;

}
