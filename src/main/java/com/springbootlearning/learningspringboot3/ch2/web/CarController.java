package com.springbootlearning.learningspringboot3.ch2.web;

import com.springbootlearning.learningspringboot3.ch2.domain.Car;
import com.springbootlearning.learningspringboot3.ch2.domain.CarRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    private final CarRepository carRepository;
    public CarController(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    @GetMapping("/cars")
    public Iterable<Car> getCars(){
        return carRepository.findAll();
    }

}
