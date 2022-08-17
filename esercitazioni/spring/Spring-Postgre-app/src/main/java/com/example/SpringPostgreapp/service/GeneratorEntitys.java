package com.example.SpringPostgreapp.service;


import com.example.SpringPostgreapp.model.*;
import com.example.SpringPostgreapp.repository.LinguaggiProgRepository;
import com.example.SpringPostgreapp.repository.PersonaRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Service
public class GeneratorEntitys {

    @Autowired
    private PersonaRepository pRepo;
    @Autowired
    private LinguaggiProgRepository lRepo;


    private Faker faker = new Faker();

    public Employe generateEmploye(){
        Employe e = new Employe();
        String username;
        do {
            username = faker.name().username();
        }while (!Pattern.matches(Regex.UserRegex,username));

        e.setEmail(faker.internet().emailAddress());
        e.setFristname(faker.name().firstName());
        e.setLastname(faker.name().lastName());
        e.setUsername(username);
        e.setAge(faker.random().nextInt(17,90));

        return e;
    }

    public Persona generatePersona(){
        IdentificativoPersonale ip = new IdentificativoPersonale();
        ip.setCountry(faker.country().name());
        ip.setCodiceFiscale(
                faker.code().asin() +
                        faker.code().asin()
        );

        Persona p = new Persona();
        p.setNome(faker.name().firstName());
        p.setCognome(faker.name().lastName());
        p.setDataNascita(faker.date().birthday());
        p.setIdentificativoPersonale(ip);

        return p;
    }

    public LinguaggiProg generateLinguaggio(){
        LinguaggiProg l = new LinguaggiProg();
        l.setNomeLinguaggio(faker.programmingLanguage().name());
        return l;
    }


    public List<Persona> aggiungiConoscenza(){
        ArrayList<Persona> person = (ArrayList<Persona>) pRepo.getRandomPersons(10);
        person.forEach(
                persona -> {
                    persona.setLinguaggiProgs(lRepo.getRandomProg(5));
                }
        );
        return pRepo.saveAll(person);
    }


}



