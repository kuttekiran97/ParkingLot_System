package com.scaler.ParkingLot.DTOs;

import com.scaler.ParkingLot.Models.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GenerateTicketRequestDto {
    private String vehicleNumber;
    private VehicleType vehicleType;
    private Long gateId;

}
