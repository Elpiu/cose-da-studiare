package com.example.SpringPostgreapp.repository;

import com.example.SpringPostgreapp.model.IdentificativoPersonale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IdentificativoPersonaleRepository extends JpaRepository<IdentificativoPersonale, String> {


}
