package com.example.mytemperature.service;


import com.example.mytemperature.model.SensorData;
import com.example.mytemperature.repository.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorDataService {

    @Autowired
    private SensorDataRepository sensorDataRepository;

    public SensorData saveSensorData(SensorData sensorData) {
        return sensorDataRepository.save(sensorData);
    }

    public List<SensorData> getAllSensorData() {
        return sensorDataRepository.findAll();
    }

    public void deleteSensorData(Long id) {
        sensorDataRepository.deleteById(id);
    }
}
