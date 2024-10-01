package com.bettingground.monster.app.dto;

import com.bettingground.monster.domain.entity.*;
import lombok.*;

public class MonsterDto {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class RegisterCommand {

        private String name;
        private String productToken;

        public Monster toEntity() {
            return Monster.builder()
                    .name(this.name)
                    .drop(new Drop(productToken))
                    .build();
        }
    }

}
