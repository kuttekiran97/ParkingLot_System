package com.scaler.ParkingLot.Strategy;

import com.scaler.ParkingLot.Models.Gate;
import com.scaler.ParkingLot.Models.ParkingSpot;
import com.scaler.ParkingLot.Models.VehicleType;

import java.util.List;

public interface SpotAssignmentStrategy {

    ParkingSpot assignParkingSpot(VehicleType vehicleType, Gate gate , List<ParkingSpot> parkingSpots);
}
