package com.bettingground.monster.domain.entity;

import com.bettingground.monster._common.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

@Entity
@Table(name = "monsters")
@Getter
@NoArgsConstructor(access = PROTECTED)
public class Monster extends BaseEntity {

    private static final String MONSTER_TOKEN_PREFIX = "monster_";

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "monster_id")
    private Long id;
    private String monsterToken;
    private String name;
    @Min(0)
    private Long hitPoints;
    @Embedded
    private Drop drop;

    @Builder
    public Monster(String name, Long hitPoints, Drop drop) {
        this.monsterToken = TokenGenerator.randomCharacterWithPrefix(MONSTER_TOKEN_PREFIX);
        this.name = name;
        this.hitPoints = calcHitPoints();
        this.drop = drop;
    }

    private Long calcHitPoints() {
        return 0L;
    }
}
