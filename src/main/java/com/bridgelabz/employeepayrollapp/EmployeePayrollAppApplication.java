package com.bridgelabz.employeepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Use Lombok Library for Logging i.e Slf4j
 */

@SpringBootApplication
@Slf4j
public class EmployeePayrollAppApplication {

    public static void main(String[] args) {

        System.out.println("Welcome To Employee Payroll Application!");
        SpringApplication.run(EmployeePayrollAppApplication.class, args);
        ApplicationContext context = SpringApplication.run(EmployeePayrollAppApplication.class, args);
        SpringApplication.run(EmployeePayrollAppApplication.class, args);
        log.info("Employee Payroll App Started in {} Environment",
                context.getEnvironment().getProperty("environment"));
    }
}


