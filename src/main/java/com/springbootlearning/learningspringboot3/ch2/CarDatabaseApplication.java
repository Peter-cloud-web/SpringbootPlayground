package com.springbootlearning.learningspringboot3.ch2;

import com.springbootlearning.learningspringboot3.ch2.domain.Car;
import com.springbootlearning.learningspringboot3.ch2.domain.CarRepository;
import com.springbootlearning.learningspringboot3.ch2.domain.Owner;
import com.springbootlearning.learningspringboot3.ch2.domain.OwnerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CarDatabaseApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(CarDatabaseApplication.class);
    private final CarRepository carRepository;
    private final OwnerRepository ownerRepository;

    public CarDatabaseApplication(CarRepository carRepository, OwnerRepository ownerRepository) {
        this.carRepository = carRepository;
        this.ownerRepository = ownerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner("John","Johnson");
        Owner owner2 = new Owner("Peter","Peterson");

        ownerRepository.saveAll(Arrays.asList(owner1,owner2));

        Car car1 = new Car("Ford","Mustang","Red","ADF-1211",2023,59000,owner1);
        Car car2 = new Car("Mercedes","Gwagon","White","ADF-1211",2023,59000,owner1);

        carRepository.save(new Car("Ford","Mustang","Red","ADF-1211",2023,59000,owner1));
        carRepository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2020, 29000, owner2));
        carRepository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2022, 39000, owner2));
        carRepository.save(car1);
        carRepository.save(car2);

        for (Car car:carRepository.findAll()){
            logger.info("brand : {}, model:{}",car.getBrand(),car.getModel());
        }

    }
}
