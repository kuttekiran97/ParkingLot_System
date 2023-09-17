package com.scaler.ParkingLot.Controllers;

import com.scaler.ParkingLot.DTOs.GenerateTicketReponseDto;
import com.scaler.ParkingLot.DTOs.GenerateTicketRequestDto;
import com.scaler.ParkingLot.DTOs.ResponseStatus;
import com.scaler.ParkingLot.Exceptions.NoParkingSpotFoundException;
import com.scaler.ParkingLot.Models.Ticket;
import com.scaler.ParkingLot.Services.TicketService;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public GenerateTicketReponseDto generateTicket(GenerateTicketRequestDto generateTicketRequestDto){

        try{
            Ticket ticket = ticketService.generateTicket(generateTicketRequestDto.getGateId(),
                                                            generateTicketRequestDto.getVehicleNumber(),
                                                            generateTicketRequestDto.getVehicleType());

            GenerateTicketReponseDto generateTicketReponseDto = new GenerateTicketReponseDto();
            generateTicketReponseDto.setTicket(ticket);
            generateTicketReponseDto.setResponseStatus(ResponseStatus.SUCCESS);

            return generateTicketReponseDto;

        } catch (NoParkingSpotFoundException e){
            GenerateTicketReponseDto generateTicketReponseDto = new GenerateTicketReponseDto();


            generateTicketReponseDto.setResponseStatus(ResponseStatus.FAILURE);
            generateTicketReponseDto.setFailureMessage(e.getMessage());

            return generateTicketReponseDto;


        }

    }
}
