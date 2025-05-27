package com.example.horse.jpa.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
public class RaceInfo {

    @Id
    @Column(name = "race_id")
    private int raceId;                 // 自增主键

    @Column(name = "race_time")
    private LocalDateTime raceTime;     // 比赛时间（由数据库自动生成）
}
