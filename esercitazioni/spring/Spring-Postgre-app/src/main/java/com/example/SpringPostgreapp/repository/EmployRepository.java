package com.example.SpringPostgreapp.repository;

import com.example.SpringPostgreapp.model.Employe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployRepository extends JpaRepository<Employe, Long> {


}
