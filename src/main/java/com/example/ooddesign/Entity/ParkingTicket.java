package com.example.ooddesign.Entity;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;

public class ParkingTicket {
    public String location;
    public Timestamp enter;
    public Timestamp exit;
    public float hourlyRatio;
    public String parkingLocation;

    public ParkingSpot parkingSpot;

    public float chargeAmount;

    public void caculate(){
        this.exit = Timestamp.from(Instant.now());
        Duration duration = Duration.between(exit.toLocalDateTime(),enter.toLocalDateTime());
        this.chargeAmount = duration.toHours() * chargeAmount;
    }

    public ParkingSpot getParkingSpot(){
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot){
        this.parkingSpot = parkingSpot;
    }

    public String getParkingLocation(){
        return parkingLocation;
    }

    public Timestamp getEnter(){
        return enter;
    }

    public void setHourlyRatio(float hourlyRatio){
        this.hourlyRatio = this.hourlyRatio;
    }
}
