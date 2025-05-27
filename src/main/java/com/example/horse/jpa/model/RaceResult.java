package com.example.horse.jpa.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
public class RaceResult {

    @Id
    @Column(name = "result_id")
    private int resultId;      // 自增主键

    @Column(name = "race_id")
    private int raceId;        // 所属比赛ID（外键）

    @Column(name = "horse_id")
    private int horseId;       // 马ID（外键）

    @Column(name = "horse_name")
    private String horseName;  // 马名

    @Column(name = "finish_time")
    private double finishTime; // 成绩（单位：秒，小数点后2位）

    @Column(name = "horse_rank")
    private int horseRank;     // 排名（第几名）

    @Column(name = "emoji")
    private String emoji;      // 表情符号
}
