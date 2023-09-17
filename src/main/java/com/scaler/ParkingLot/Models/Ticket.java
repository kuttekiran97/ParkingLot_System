package com.scaler.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class Ticket extends BaseModel{

    private Date entryTime;
    private Operator operator;
    private Gate gate;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;

}
