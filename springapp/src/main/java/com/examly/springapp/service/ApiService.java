package com.examly.springapp.service;

import com.examly.springapp.model.Truck;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ApiService {

    private final Map<Integer, Truck> truckData;

    public ApiService() {
        this.truckData = new HashMap<>();
    }

    public boolean addTruck(Truck truck) {
        if (truckData.containsKey(truck.getTruckId())) {
            return false;
        }
        truckData.put(truck.getTruckId(), truck);
        return true;
    }

    public Truck getTruckById(int truckId) {
        return truckData.get(truckId);
    }

    public List<Truck> getAllTrucks() {
        return new ArrayList<>(truckData.values());
    }
}
