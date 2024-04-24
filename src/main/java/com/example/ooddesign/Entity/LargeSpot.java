package com.example.ooddesign.Entity;

public class LargeSpot extends ParkingSpot{
    public LargeSpot() {
        this.hourlyRatio = 10;
    }

    @Override
    public void park(ParkingLot parkingLot, ParkingSpot LargeSpot) {
        super.park(parkingLot, LargeSpot);
        parkingLot.availableLargeSpot--;
        parkingLot.largeSpotId++;
        this.parkingLocation = ""+parkingLot.largeSpotId;
        parkingLot.ParkingSpots.put(this.parkingLocation,LargeSpot);
    }

    @Override
    public void exit(ParkingLot parkingLot, ParkingSpot LargeSpot) {
        super.exit(parkingLot, LargeSpot);
        parkingLot.ParkingSpots.remove(this.parkingLocation,LargeSpot);
        parkingLot.availableLargeSpot++;
        parkingLot.largeSpotId--;
    }
}
