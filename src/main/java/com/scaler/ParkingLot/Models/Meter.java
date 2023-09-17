package com.scaler.ParkingLot.Models;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class Meter extends BaseModel{
    private Date startTime;
    private Date endTime;
    private int unitConsumed;
    private int ratePerUnit;


}
