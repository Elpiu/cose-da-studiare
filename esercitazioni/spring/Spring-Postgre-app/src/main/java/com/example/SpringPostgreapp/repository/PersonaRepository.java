package com.example.SpringPostgreapp.repository;

import com.example.SpringPostgreapp.model.IdentificativoPersonale;
import com.example.SpringPostgreapp.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, String> {

    @Query(value = "SELECT p.cf_persona FROM persona p", nativeQuery = true )
    List<String> getAllCode();

    @Query(value = "SELECT DISTINCT  p.nome FROM persona p", nativeQuery = true)
    List<String> getAllName();

    @Query(value = "SELECT Round(AVG(years),0) AS average FROM (\n" +
            "SELECT EXTRACT(YEAR from data_nascita) AS years FROM persona) AS derivate", nativeQuery = true)
    int getEtaMedia();

    @Query(value = "SELECT * FROM persona ORDER BY RANDOM() LIMIT ?", nativeQuery = true)
    List<Persona> getRandomPersons(int howMany);

    @Query(value = "\n" +
            "SELECT per.* FROM persona AS per INNER JOIN (\n" +
            "\tSELECT person_id, lenguage_id \n" +
            "\t\tFROM linguaggi_prog AS lp INNER JOIN persona_know_lenguage AS kl \n" +
            "\t\t\tON lp.id = kl.lenguage_id WHERE kl.lenguage_id=(\n" +
            "\t\t\tSELECT id FROM linguaggi_prog AS lp WHERE lp.linguaggio=?\n" +
            "\t\t\t)) \n" +
            "\t\t\t\tAS subQuery ON person_id= per.id",
            nativeQuery = true)
    List<Persona> getPersoneWhoKnowLenguage(String nomeLinguaggio);

}
