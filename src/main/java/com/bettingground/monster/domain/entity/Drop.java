package com.bettingground.monster.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Drop {
    @Column(name = "drop_product_token")
    private String productToken;
}
