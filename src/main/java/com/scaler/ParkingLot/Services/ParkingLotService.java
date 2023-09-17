package com.scaler.ParkingLot.Services;

import com.scaler.ParkingLot.Models.Gate;
import com.scaler.ParkingLot.Models.ParkingSpot;
import com.scaler.ParkingLot.Models.Vehicle;
import com.scaler.ParkingLot.Repositories.ParkingLotRepository;
import com.scaler.ParkingLot.Strategy.SpotAssignmentStrategy;

import java.util.List;

public class ParkingLotService {
    private SpotAssignmentStrategy spotAssignmentStrategy;
    private ParkingLotRepository parkingLotRepository;

    public ParkingLotService(ParkingLotRepository parkingLotRepository, SpotAssignmentStrategy spotAssignmentStrategy) {
        this.parkingLotRepository = parkingLotRepository;
        this.spotAssignmentStrategy = spotAssignmentStrategy;
    }

    public ParkingLotService(SpotAssignmentStrategy spotAssignmentStrategy) {
        this.spotAssignmentStrategy = spotAssignmentStrategy;
    }

    public ParkingSpot getparkingSpot(Vehicle vehicle, Gate gate) {

        List<ParkingSpot> parkingSpotList = parkingLotRepository.getAllParkingSpots();

        return spotAssignmentStrategy.assignParkingSpot(vehicle.getVehicleType(), gate, parkingSpotList);
    }


}
