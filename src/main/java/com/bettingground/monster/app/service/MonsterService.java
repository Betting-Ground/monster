package com.bettingground.monster.app.service;

import com.bettingground.monster.app.dto.*;
import com.bettingground.monster.domain.entity.*;
import com.bettingground.monster.domain.service.*;
import lombok.*;
import org.springframework.stereotype.*;

@Service
@RequiredArgsConstructor
public class MonsterService {

    private final MonsterStore monsterStore;

    public String register(MonsterDto.RegisterCommand command) {
        Monster initMonster = command.toEntity();
        Monster monster = monsterStore.store(initMonster);
        return monster.getMonsterToken();
    }

}
