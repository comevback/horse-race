package com.example.horse.jpa.mybatis;

import com.example.horse.jpa.model.RaceInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RaceInfoMapper {
    List<RaceInfo> findAll();

    void insertRace(RaceInfo raceInfo);

    void deleteAll();
}
