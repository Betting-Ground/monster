package com.bettingground.monster.app.service;

import com.bettingground.monster.app.dto.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MonsterServiceTest {
    
    @Autowired
    MonsterService monsterService;

    @Test
    public void register() throws Exception {
        // given
        MonsterDto.RegisterCommand command = new MonsterDto.RegisterCommand("dino", "product_ifj2f98uscvn2kfn2f3");

        // when
        String monsterToken = monsterService.register(command);

        // then
        System.out.println("monsterToken = " + monsterToken);
    }

}