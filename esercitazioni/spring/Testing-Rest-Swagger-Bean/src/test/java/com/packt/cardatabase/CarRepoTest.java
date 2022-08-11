package com.packt.cardatabase;



import com.packt.cardatabase.model.entity.Car;
import com.packt.cardatabase.model.repository.CarRepository;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CarRepoTest {

    @Autowired
    CarRepository carRepository;

    private Car car1;

    @BeforeAll
    public void setup() {
        car1 = new Car("Seat","Ibiza","Black","005522",2015,50000,"",null);
        car1  = carRepository.save(car1);
    }

    @AfterAll
    public void teardown() {
        carRepository.delete(car1);
    }

    @Test
    public void test_inserimento_car(){
        Optional<Car> car2 = carRepository.findById(car1.getId());
        assertTrue(car2.isPresent());
        assertEquals(car1,car2.get());
    }

    @Test void test_id_non_presente(){
        Optional<Car> c = carRepository.findById(-1L);

        assertThrows(NoSuchElementException.class,
                () ->  c.get(), "Non deve esistere car con id -1");
    }


}
