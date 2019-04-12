package com.pozarycki.tasks;

import com.pozarycki.tasks.domain.Task;
import com.pozarycki.tasks.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class TasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(TasksApplication.class, args);
    }

    // creates dummy data for the app
    @Bean
    CommandLineRunner runner(TaskService taskService) {
        return args -> {
            taskService.save(new Task(1L,"Drink coffee", LocalDate.now(),true));
            taskService.save(new Task(2L,"Go to work", LocalDate.now().plus(1, ChronoUnit.DAYS),false));
            taskService.save(new Task(3L,"Create something memorable", LocalDate.now().plus(3, ChronoUnit.DAYS),false));
            taskService.save(new Task(4L,"Write a book", LocalDate.now().plus(5, ChronoUnit.DAYS),false));
            taskService.save(new Task(5L,"Buy new notebook", LocalDate.now().plus(6, ChronoUnit.DAYS),false));
            taskService.save(new Task(6L,"Read a book", LocalDate.now().plus(7, ChronoUnit.DAYS),false));
            taskService.save(new Task(7L,"Drink coffee again", LocalDate.now().plus(15, ChronoUnit.DAYS),false));

        };
    }

}
