package com.example.horse.service.impl;

import com.example.horse.dto.HorseInfoDto;
import com.example.horse.jpa.model.HorseInfo;
import com.example.horse.jpa.mybatis.HorseInfoMapper;
import com.example.horse.service.HorseService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HorseServiceImpl implements HorseService {
    // Implement the HorseService interface methods here
    // For example:

    @Autowired
    private HorseInfoMapper horseInfoMapper;

    @Override
    public List<HorseInfo> getAllHorses() {
        return horseInfoMapper.findAll();
    }

    @Override
    public void saveHorse(HorseInfoDto horseInfoDto) {
        HorseInfo horseInfo = new HorseInfo();
        BeanUtils.copyProperties(horseInfoDto, horseInfo);
        horseInfoMapper.insert(horseInfo);
    }

    @Override
    public void deleteHorse(int id) {
        HorseInfo horseInfo = horseInfoMapper.findById(id);
        if (horseInfo != null) {
            horseInfoMapper.delete(id);
        } else {
            throw new IllegalArgumentException("Horse with id: " + id + " does not exist.");
        }
    }
}
