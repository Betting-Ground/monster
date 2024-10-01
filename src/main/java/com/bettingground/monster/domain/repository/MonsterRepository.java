package com.bettingground.monster.domain.repository;

import com.bettingground.monster.domain.entity.*;
import org.springframework.data.jpa.repository.*;

public interface MonsterRepository extends JpaRepository<Monster, Long> {
}
