package com.example.horse.jpa.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "horse_info")
public class HorseInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "horse_id")
    private int horseId;

    @Column(name = "horse_name")
    private String horseName;

    @Column(name = "color")
    private String color;

    @Column(name = "speed")
    private int speed;

    @Column(name = "stamina")
    private int stamina;

    @Column(name = "emoji")
    private String emoji;
}
