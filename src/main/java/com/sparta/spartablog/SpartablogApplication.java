package com.sparta.spartablog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@EnableJpaAuditing
@SpringBootApplication
public class SpartablogApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpartablogApplication.class, args);
    }

}
