package com.example.mytemperature.api;


import com.example.mytemperature.model.SensorData;
import com.example.mytemperature.repository.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class SensorDataController {

    @Autowired
    private SensorDataRepository sensorDataRepository;

    @PostMapping("/sensor-data")
    public SensorData receiveSensorData(@RequestBody SensorData sensorData) {
        sensorData.setTimestamp(LocalDateTime.now());
        return sensorDataRepository.save(sensorData);
    }

    @GetMapping("/sensor-data")
    public List<SensorData> getAllSensorData() {
        return sensorDataRepository.findAll();
    }

    @GetMapping("/index")
    public String home() {
        return "index.html";
    }
}
