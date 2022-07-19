package com.luyenlaptrinh.firstproject;

import com.luyenlaptrinh.firstproject.service.Shape;
import com.luyenlaptrinh.firstproject.service.imp.HinhVuong;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@EnableScheduling
@SpringBootApplication()
public class FirstProjectApplication {
    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(FirstProjectApplication.class, args);
    }
}
