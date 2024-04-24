package com.example.ooddesign.Entity;

public class CompactSpot extends ParkingSpot{

    public CompactSpot() {
        this.hourlyRatio = 5;
    }

    @Override
    public void park(ParkingLot parkingLot, ParkingSpot CompactSpot) {
        super.park(parkingLot, CompactSpot);
        parkingLot.availableCompactSpot--;
        parkingLot.compactSpotId++;
        this.parkingLocation = ""+parkingLot.compactSpotId;
        parkingLot.ParkingSpots.put(this.parkingLocation,CompactSpot);
    }

    @Override
    public void exit(ParkingLot parkingLot, ParkingSpot CompactSpot) {
        super.exit(parkingLot, CompactSpot);
        parkingLot.ParkingSpots.remove(this.parkingLocation,CompactSpot);
        parkingLot.availableCompactSpot++;
        parkingLot.compactSpotId--;
    }
}
