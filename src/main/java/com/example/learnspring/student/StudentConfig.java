package com.example.learnspring.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.time.LocalDate;
import java.time.Month;
import java.util.List;



@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student mary = new Student(
                    "Mary",
                    "mary.jane@gmail.com",
                    LocalDate.of(2000, Month.AUGUST,5)
            );

            Student liam = new Student(
                    "Liam",
                    "liam.galagher@gmail.com",
                    LocalDate.of(2004, Month.JANUARY,12)

            );


            studentRepository.saveAll(
                    List.of(mary, liam)
            );
        };

    }
}
