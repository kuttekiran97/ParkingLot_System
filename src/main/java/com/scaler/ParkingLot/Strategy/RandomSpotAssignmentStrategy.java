package com.scaler.ParkingLot.Strategy;

import com.scaler.ParkingLot.Models.Gate;
import com.scaler.ParkingLot.Models.ParkingSpot;
import com.scaler.ParkingLot.Models.ParkingSpotStatus;
import com.scaler.ParkingLot.Models.VehicleType;

import java.util.List;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy {


    @Override
    public ParkingSpot assignParkingSpot(VehicleType vehicleType, Gate gate, List<ParkingSpot> parkingSpots) {
        for(ParkingSpot parkingSpot : parkingSpots){
            if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE) &&
                    parkingSpot.getSupportedVehicleTypes().contains(vehicleType)){
                return parkingSpot;



            }
        }
        return null;
    }
}
