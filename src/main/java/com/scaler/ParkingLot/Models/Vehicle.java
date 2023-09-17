package com.scaler.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Vehicle extends BaseModel{

    private VehicleType vehicleType;
    private String number;
}
