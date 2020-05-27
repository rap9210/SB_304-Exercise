package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CarRepository carRepository;

    @Override
    public void run(String... strings) throws Exception {

        Car car = new Car();
        car.setYear(2010);
        car.setMake("Honda");
        car.setModel("CRV");
        carRepository.save(car);

        car = new Car(2011, "Honda", "Accord");
        carRepository.save(car);

        car = new Car(2010, "Toyota", "RAV-4");
        carRepository.save(car);

    }
}
