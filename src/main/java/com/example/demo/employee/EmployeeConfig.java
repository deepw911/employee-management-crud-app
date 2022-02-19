package com.example.demo.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class EmployeeConfig {

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository repository) {
        return args -> {
            Employee alpha = new Employee(
                "Alpha",
                21,
                "alpha@gmail.com",
                243L
            );

            Employee beta = new Employee(
                    "Beta",
                    27,
                    "beta@gmail.com",
                    247L
            );

            repository.saveAll(
                    List.of(alpha,beta)
            );
        };
    }
}
