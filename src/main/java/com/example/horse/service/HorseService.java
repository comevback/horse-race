package com.example.horse.service;

import com.example.horse.dto.HorseInfoDto;
import com.example.horse.jpa.model.HorseInfo;

import java.util.List;

public interface HorseService {

    // Method to get all horses
    List<HorseInfo> getAllHorses();

    void saveHorse(HorseInfoDto horseInfoDto);

    // Method to delete a horse by ID
    void deleteHorse(int id);
}
