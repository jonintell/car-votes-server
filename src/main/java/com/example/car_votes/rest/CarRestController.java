package com.example.car_votes.rest;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.car_votes.entity.CarEntity;


import com.example.car_votes.service.CarService;

@RestController
@RequestMapping("/api/cars")
@CrossOrigin(origins = "http://localhost:4200")
public class CarRestController {
    private final CarService carService;

    public CarRestController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<CarEntity> getAllCars() {
        return carService.getAllCars();
    }
    
    @PostMapping("/vote")
    public synchronized CarEntity addVote(@RequestParam long carId) {
        return carService.addVote(carId);
    }
}





