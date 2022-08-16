package com.example.SpringPostgreapp.repository;

import com.example.SpringPostgreapp.model.Employe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EmployRepository extends JpaRepository<Employe, Long> {


}
