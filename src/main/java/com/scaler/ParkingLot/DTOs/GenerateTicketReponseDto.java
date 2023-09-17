package com.scaler.ParkingLot.DTOs;

import com.scaler.ParkingLot.Models.Ticket;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GenerateTicketReponseDto {
    private Ticket ticket;
    private ResponseStatus responseStatus;
    private String failureMessage;


}
