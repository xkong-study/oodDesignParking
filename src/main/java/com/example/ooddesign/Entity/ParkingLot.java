package com.example.ooddesign.Entity;

import java.util.Map;
import java.util.Objects;

public class ParkingLot {
    public Map<String,ParkingSpot> ParkingSpots;

    public Map<String,Double> parkingTickets;

    public Integer compactSpotId;

    public Integer largeSpotId;

    public Integer availableCompactSpot = 100 ;

    public Integer availableLargeSpot = 100;

    Map<String,ParkingTicket> parkingTicketMap;

    public ParkingTicket park(String vehicleType) throws Exception{
    if(checkFull(vehicleType)) throw new Exception();
    ParkingSpot parkingSpot = getParkingSpot(vehicleType);
    ParkingTicket parkingTicket = new ParkingTicket();
    parkingTicket.setHourlyRatio(parkingSpot.hourlyRatio);
    parkingTicket.setParkingSpot(parkingSpot);
    parkingTicketMap.put(parkingSpot.parkingLocation, parkingTicket);
    return parkingTicket;
    }

    private boolean checkFull(String vehicleType){
        if(Objects.equals(vehicleType, "largeSpot")){
            return availableLargeSpot<=0;
        }

        if(Objects.equals(vehicleType, "CompactSpot")){
            return availableCompactSpot<=0;
        }
        return true;
    }

    private ParkingSpot getParkingSpot(String vehicleType){
        if(Objects.equals(vehicleType,"largeSpot")){
            return new LargeSpot();
        }
        if(Objects.equals(vehicleType,"CompactSpot")){
            return new CompactSpot();
        }
        return null;
    }

    public ParkingTicket exit(String parkingLocation){
        ParkingTicket parkingTicket = parkingTicketMap.get(parkingLocation);
        ParkingSpot parkingSpot = parkingTicket.getParkingSpot();
        parkingSpot.exit(this,parkingSpot);
        parkingTicket.caculate();
        return parkingTicket;
    }

}
