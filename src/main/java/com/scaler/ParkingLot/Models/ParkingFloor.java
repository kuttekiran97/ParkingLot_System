package com.scaler.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class ParkingFloor extends BaseModel {

    private int number;
    private List<ParkingSpot> parkingSpots;
    private ParkingFloorStatus parkingFloorStatus;



}
