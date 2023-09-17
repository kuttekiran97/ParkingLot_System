package com.scaler.ParkingLot.Services;

import com.scaler.ParkingLot.Models.*;
import com.scaler.ParkingLot.Repositories.TicketRepository;
import com.scaler.ParkingLot.Strategy.SpotAssignmentStrategy;

import java.util.Date;

public class TicketService {

    private VehicleService vehicleService;
    private Gateservice gateservice;
    private ParkingSpotService parkingSpotService;

    private TicketRepository ticketRepository;

    private SpotAssignmentStrategy spotAssignmentStrategy;

    private ParkingLotService parkingLotService;
    public Ticket generateTicket(long gateId, String vehicleNumber, VehicleType vehicleType) {

        //Flow :
        //1. Get the Vehicle from DB using vehicleNumber (in our case ,we are using hashmap as DB )
        //2. If Vehicle is not found, register the vehicle
        Vehicle vehicle = vehicleService.getVehicle(vehicleNumber);
        if(vehicle==null){
            vehicle = vehicleService.registerVehicle(vehicleNumber,vehicleType);
        }

        Gate gate = gateservice.getGate(gateId);

        //3. Assign the Parking spot

        ParkingSpot parkingSpot = parkingLotService.getparkingSpot(vehicle, gate);

        //4. Update the Parking spot as Occupied
        ParkingSpot parkingSpot = parkingSpotService.assignParkingSpot(parkingSpot);

        //5. Generate the ticket
        Ticket ticket = new Ticket();
        ticket.setVehicle(vehicle);
        ticket.setGate(gate);
        ticket.setParkingSpot(parkingSpot);
        ticket.setOperator(gate.getOperator());
        ticket.setEntryTime(new Date());

        //To save the ticket
        ticketRepository.save(ticket);




        return ticket;
    }
}
