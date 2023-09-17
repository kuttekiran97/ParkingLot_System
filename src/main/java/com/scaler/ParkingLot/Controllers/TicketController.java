package com.scaler.ParkingLot.Controllers;

import com.scaler.ParkingLot.DTOs.GenerateTicketReponseDto;
import com.scaler.ParkingLot.DTOs.GenerateTicketRequestDto;
import com.scaler.ParkingLot.Models.Ticket;
import com.scaler.ParkingLot.Services.TicketService;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TicketController {

    private TicketService ticketService;
    public GenerateTicketReponseDto generateTicket(GenerateTicketRequestDto generateTicketRequestDto){


        Ticket ticket = ticketService.generateTicket(generateTicketRequestDto.getGateId(),
                                                        generateTicketRequestDto.getVehicleNumber(),
                                                        generateTicketRequestDto.getVehicleType());

        return null;

    }
}
