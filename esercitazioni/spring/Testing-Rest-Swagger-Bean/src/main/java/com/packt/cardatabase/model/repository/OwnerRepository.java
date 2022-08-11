package com.packt.cardatabase.model.repository;


import com.packt.cardatabase.model.entity.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
