package com.scaler.ParkingLot.Models;


import lombok.* ;

import java.util.List;

@Getter
@Setter
public class Parkinglot extends Basemodel {
    private String name;
    private List<ParkingFloor> parkingFloors;
    private  List<Gate> gates;
    private  ParkinglotStatus parkinglotStatus;

}
