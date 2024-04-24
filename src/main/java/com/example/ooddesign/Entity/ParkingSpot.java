package com.example.ooddesign.Entity;

public class ParkingSpot {
    public String parkingLocation;

    public float hourlyRatio;

    public String getParkingLocation() {
        return parkingLocation;
    }

    public void setParkingLocation(String parkingLocation) {
        this.parkingLocation = parkingLocation;
    }

    public void park(ParkingLot parkingLot,ParkingSpot parkingSpot){}

    public void exit(ParkingLot parkingLot,ParkingSpot parkingSpot){}
}
