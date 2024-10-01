package com.bettingground.monster.domain.entity;

import jakarta.persistence.*;
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
    private Long hitPoints;
    @Embedded
    private Drop drop;

}
