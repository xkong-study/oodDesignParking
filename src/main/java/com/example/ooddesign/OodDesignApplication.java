package com.example.ooddesign;

import com.example.ooddesign.Entity.ParkingLot;
import com.example.ooddesign.Entity.ParkingTicket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OodDesignApplication {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(OodDesignApplication.class, args);
        ParkingLot parkingLot = new ParkingLot();
        ParkingTicket parkingTicket = parkingLot.park("large");
        ParkingTicket parkingTicket1 = parkingLot.exit("1");
    }

}
