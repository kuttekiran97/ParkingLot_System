package com.scaler.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gate extends BaseModel {

    private int gateNumber;
    private GateType gateType;
    private Operator operator;
    private GateStatus gateStatus;
}
