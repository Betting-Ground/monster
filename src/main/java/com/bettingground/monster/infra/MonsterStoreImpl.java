package com.bettingground.monster.infra;

import com.bettingground.monster.domain.entity.*;
import com.bettingground.monster.domain.repository.*;
import com.bettingground.monster.domain.service.*;
import lombok.*;
import org.springframework.stereotype.*;

@Component
@RequiredArgsConstructor
public class MonsterStoreImpl implements MonsterStore {

    private final MonsterRepository monsterRepository;

    @Override
    public Monster store(Monster initMonster) {
        return monsterRepository.save(initMonster);
    }
}
