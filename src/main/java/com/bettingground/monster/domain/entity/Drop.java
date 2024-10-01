package com.bettingground.monster.domain.entity;

import jakarta.persistence.*;

@Embeddable
public class Drop {
    @Column(name = "drop_product_token")
    private String productToken;
}
