package com.example.SpringPostgreapp.repository;

import com.example.SpringPostgreapp.model.LinguaggiProg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface LinguaggiProgRepository extends JpaRepository<LinguaggiProg, Long> {

    @Query(value = "SELECT * FROM linguaggi_prog ORDER BY RANDOM() LIMIT ?" , nativeQuery = true)
    ArrayList<LinguaggiProg> getRandomProg(int howMany);

}
