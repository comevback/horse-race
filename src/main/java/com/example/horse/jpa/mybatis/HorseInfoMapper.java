package com.example.horse.jpa.mybatis;

import com.example.horse.jpa.model.HorseInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HorseInfoMapper {
     List<HorseInfo> findAll();

     HorseInfo findById(int id);

     void insert(HorseInfo horseInfo);

     void update(HorseInfo horseInfo);

     void delete(int id);

     void deleteAll();
}
