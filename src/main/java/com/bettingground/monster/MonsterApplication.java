package com.bettingground.monster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.*;

@EnableJpaAuditing
@SpringBootApplication
public class MonsterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonsterApplication.class, args);
    }

}
