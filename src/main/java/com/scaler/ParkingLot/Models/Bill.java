package com.scaler.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
public class Bill extends BaseModel{

    private Ticket ticket;
    private Date exitTime;
    private int amount;
    private Operator operator;
    private Gate gate;
    private List<Payment> payments;
    private BillStatus billStatus;
}
