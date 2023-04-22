package com.parking.apiparking.controller;

import com.parking.apiparking.services.ParkingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parking") //parking => url
public class ParkingController {
    //Inyección de dependencias => instancia => new ParkingService()
    public ParkingController(ParkingService parkingService){
        this.parkingService = parkingService;
    }
    @GetMapping("/cars")
    public List<Car> getAllCars(){
        
    }

}
