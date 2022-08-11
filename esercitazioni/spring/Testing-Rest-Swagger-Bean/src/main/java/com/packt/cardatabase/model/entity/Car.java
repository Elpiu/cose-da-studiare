package com.packt.cardatabase.model.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@Entity
public class Car {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="owner")
    private Owner owner;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NonNull
    private String brand, model, color, registerNumber;
    @NonNull
    private int year, price;

    @Column(nullable = true, length =20, name = "score")
    @Size(min = 0, max =500)
    private String scoreboard;

    public Car() {

    }

    public Car(@NonNull String brand, @NonNull String model, @NonNull String color, @NonNull String registerNumber, @NonNull int year, @NonNull int price, String scoreboard, Owner owner) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registerNumber = registerNumber;
        this.year = year;
        this.price = price;
        this.scoreboard = scoreboard;
        this.owner = owner;
    }
}
