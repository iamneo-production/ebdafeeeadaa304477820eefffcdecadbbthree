package com.examly.springapp.controller;

import com.examly.springapp.model.Truck;
import com.examly.springapp.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TruckController {

    private final ApiService apiService;

    @Autowired
    public TruckController(ApiService apiService) {
        this.apiService = apiService;
    }

    @PostMapping("/")
    public boolean addTruck(@RequestBody Truck truck) {
        return apiService.addTruck(truck);
    }

    @GetMapping("/{truckId}")
    public Truck getTruckById(@PathVariable int truckId) {
        return apiService.getTruckById(truckId);
    }

    @GetMapping("/")
    public List<Truck> getAllTrucks() {
        return apiService.getAllTrucks();
    }
}
