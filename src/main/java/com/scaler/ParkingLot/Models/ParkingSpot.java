package com.scaler.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ParkingSpot extends BaseModel {
    private ParkingSpotStatus parkingSpotStatus;
    private ParkingFloor parkingFloor;
    private List<VehicleType> supportedVehicleTypes;
    private int number;

}
