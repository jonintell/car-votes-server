package com.example.car_votes.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.car_votes.entity.CarEntity;
import com.example.car_votes.repository.CarRepository;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<CarEntity> getAllCars() {
        List<CarEntity> cars = carRepository.findAll();
        cars.sort(Comparator.comparing(CarEntity::getId));
        return cars;
    }

	public CarEntity addVote(long carId) {
		CarEntity car = carRepository.getOne(carId);
		car.setNumberOfVotes(car.getNumberOfVotes() + 1);
		carRepository.save(car);
		return car;
	}
}
