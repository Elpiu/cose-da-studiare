package com.packt.cardatabase.web;

import com.packt.cardatabase.model.entity.Car;
import com.packt.cardatabase.model.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.webjars.NotFoundException;


@RestController
@RequestMapping("/api/car")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping("/getAll")
    public Iterable<Car> getCars(){
        return carRepository.findAll();
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable long id){
        return carRepository.findById(id).orElseThrow(() -> new NotFoundException("Non trovata!"));
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Car updateCar(
            @PathVariable("id") final String id, @RequestBody final Car car
    ){
        return carRepository.save(car);
    }
}
