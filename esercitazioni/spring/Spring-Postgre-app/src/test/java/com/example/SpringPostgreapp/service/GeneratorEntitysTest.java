package com.example.SpringPostgreapp.service;

import com.example.SpringPostgreapp.model.Employe;
import com.example.SpringPostgreapp.model.Regex;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GeneratorEntitysTest {

    @Autowired
    private GeneratorEntitys generatorEntitys;

    @Test
    void generateEmploye() {
        Employe e = generatorEntitys.generateEmploye();
        assertAll("Assert all", () -> {
            assertNotNull(e.getEmail(),"Email è null!");
            assertNotNull(e.getFristname(), "Fristname è null");
            assertNotNull(e.getLastname(), "Lastname è null");
            assertTrue(17 <= e.getAge() && e.getAge() <= 90 , "Età non va bene");
            assertTrue(Pattern.matches(Regex.UserRegex, e.getUsername()),"Username non valido");

        });
    }
}