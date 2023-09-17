package com.scaler.ParkingLot.Services;

import com.scaler.ParkingLot.Models.Vehicle;
import com.scaler.ParkingLot.Models.VehicleType;
import com.scaler.ParkingLot.Repositories.VehicleRepository;

public class VehicleService {
    private VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository){
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle registerVehicle(String number, VehicleType type){
        return vehicleRepository.addVehicle(new Vehicle(type,number));

    }

    public Vehicle getVehicle(String number){
        return vehicleRepository.getVehicle(number);
    }
}
