package com.scaler.ParkingLot.Repositories;

import com.scaler.ParkingLot.Models.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {
    //Since we are not using any database(MySQL etc), we are going with in-memory by using Hashmap

    Map<String, Vehicle>  vehicleStore;

    public VehicleRepository() {
        this.vehicleStore = new HashMap<>();
    }

    public Vehicle addVehicle(Vehicle vehicle){
        vehicleStore.put(vehicle.getNumber(),vehicle);
        return vehicle;

    }

    public Vehicle getVehicle(String number){
        return vehicleStore.get(number);
    }
}
