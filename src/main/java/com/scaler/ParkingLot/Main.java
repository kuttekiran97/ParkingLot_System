package com.scaler.ParkingLot;

import com.scaler.ParkingLot.Controllers.TicketController;
import com.scaler.ParkingLot.Services.TicketService;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello ! Welcome to ParkingLot System");

        //        GenerateTicketRequestDto generateTicketRequestDto =
//                new GenerateTicketRequestDto();
//        /*--*/
//        TicketController ticketController = new TicketController();
//        ticketController.generateTicket(generateTicketRequestDto);

        ObjectContainer objectContainer = new ObjectContainer();

        TicketService ticketService = new TicketService();
        objectContainer.register("ticketService", ticketService);

        TicketController ticketController =
                new TicketController((TicketService) objectContainer.get("ticketService"));

    }

    /*
    TODO : Need to complete generate ticket and implement generate bill
    */

    }
}
