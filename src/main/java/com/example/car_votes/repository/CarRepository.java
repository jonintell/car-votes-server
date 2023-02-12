package com.example.car_votes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.car_votes.entity.CarEntity;


@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {

}
