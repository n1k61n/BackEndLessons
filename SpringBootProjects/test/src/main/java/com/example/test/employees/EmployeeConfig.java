package com.example.test.employees;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class EmployeeConfig {

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository){
        return (args) -> {
            var employeeList = List.of(new Employee(
                    null,
                    "Emin",
                    "eminelxanoglu@gmail.com",
                    LocalDate.of(1981, 4, 21),
                    1000
            ),new Employee(
                    null,
                    "Tunar",
                    "tunar@gmail.com",
                    LocalDate.of(2009, 4, 21),
                    2000
            )
            );
            employeeRepository.saveAll(employeeList);
        };
    }
}
