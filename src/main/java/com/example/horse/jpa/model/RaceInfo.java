package com.example.horse.jpa.model;

import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Data
public class RaceInfo {

    @Id
    @Column(name = "race_id")
    private int raceId;                 // 自增主键

    @Column(name = "race_time")
    private LocalDateTime raceTime;     // 比赛时间（由数据库自动生成）
}
