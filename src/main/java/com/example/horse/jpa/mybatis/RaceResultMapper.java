package com.example.horse.jpa.mybatis;

import com.example.horse.jpa.model.RaceResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RaceResultMapper {
    List<RaceResult> findByRaceId(int raceId);

    List<RaceResult> findByHorseId(int horseId);

    List<RaceResult> findByRaceIdAndHorseId (int raceId, int horseId);

    void insertResult(RaceResult raceResult);

    void insertBatchResults(List<RaceResult> raceResults);

    void deleteAll();
}
