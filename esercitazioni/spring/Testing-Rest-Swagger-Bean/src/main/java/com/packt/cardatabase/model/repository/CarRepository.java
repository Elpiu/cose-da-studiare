package com.packt.cardatabase.model.repository;

import com.packt.cardatabase.model.entity.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository  extends CrudRepository<Car, Long> {
    @Query("select c from Car c where c.year between ?1 and ?2")
    List<Car> findYearBetween(int yearStart, int yearEnd);

    @Query("select c from Car c where c.color = ?1")
    List<Car> findByColor(String color);

    @Query("select c from Car c where c.year between ?1 and ?2 and c.price < ?3 and c.color = ?4")
    List<Car> findByYearIsBetweenAndPriceIsLessThanAndColor(int yearStart, int yearEnd, int price, String color);






}
