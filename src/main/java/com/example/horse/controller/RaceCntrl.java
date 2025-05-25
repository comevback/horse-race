package com.example.horse.controller;

import com.example.horse.dto.HorseInfoDto;
import com.example.horse.jpa.model.HorseInfo;
import com.example.horse.jpa.model.RaceInfo;
import com.example.horse.jpa.model.RaceResult;
import com.example.horse.jpa.mybatis.RaceInfoMapper;
import com.example.horse.jpa.mybatis.RaceResultMapper;
import com.example.horse.service.HorseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/")
public class RaceCntrl {

    @Autowired
    private HorseService horseService;

    @Autowired
    private RaceInfoMapper raceInfoMapper;

    @Autowired
    private RaceResultMapper raceResultMapper;

    @RequestMapping(value = "/race", method = RequestMethod.GET)
    public String init() {
        return "race";
    }

    @GetMapping("/race/horses")
    @ResponseBody
    public List<HorseInfo> getAllHorses() {
        return horseService.getAllHorses();
    }

    @PostMapping("/race/horses")
    @ResponseBody
    public String saveHorse(@RequestBody HorseInfoDto horseInfoDto) {
        horseService.saveHorse(horseInfoDto);
        return "OK";
    }

    @PostMapping("/race/horses/delete/{id}")
    @ResponseBody
    public ResponseEntity<Void> deleteHorse(@PathVariable int id) {
        horseService.deleteHorse(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/race/list")
    @ResponseBody
    public List<RaceInfo> getAllRaces() {
        return raceInfoMapper.findAll();
    }

    @PostMapping("/race")
    @ResponseBody
    public int saveRace(@RequestBody RaceInfo raceInfo) {
        raceInfoMapper.insertRace(raceInfo);
        return raceInfo.getRaceId();
    }

    @GetMapping("/race/results/{raceId}")
    @ResponseBody
    public List<RaceResult> getRaceResults(@PathVariable int raceId) {
        return raceResultMapper.findByRaceId(raceId);
    }

    @PostMapping("/race/results")
    @ResponseBody
    public String saveRaceResults(@RequestBody List<RaceResult> resultList) {
        raceResultMapper.insertBatchResults(resultList);
        return "OK";
    }

    @PostMapping("/race/results/delete")
    @ResponseBody
    public String deleteAllResults() {
        raceResultMapper.deleteAll();
        return "OK";
    }

    @PostMapping("/race/delete")
    @ResponseBody
    public String deleteAllRaces() {
        raceResultMapper.deleteAll();
        raceInfoMapper.deleteAll();
        return "OK";
    }
}
