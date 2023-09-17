package com.scaler.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Payment extends BaseModel{
    private PaymentMode paymentMode;
    private int amount;
    private PaymentStatus paymentStatus;
    private String referenceId;

}
