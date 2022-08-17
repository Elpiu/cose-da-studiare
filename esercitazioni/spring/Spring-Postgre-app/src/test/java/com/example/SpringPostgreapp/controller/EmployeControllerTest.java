package com.example.SpringPostgreapp.controller;

import com.example.SpringPostgreapp.exception.ResourceNotFoundException;
import com.example.SpringPostgreapp.model.Employe;
import com.example.SpringPostgreapp.repository.EmployRepository;
import lombok.SneakyThrows;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class EmployeControllerTest {

    @Mock
    EmployRepository employRepository;

    @InjectMocks
    EmployeController employeController;

    private Employe createE1(){
        Employe e1 = new Employe();
        e1.setAge(30);
        e1.setEmail("elpiuu@gmail.com");
        e1.setUsername("elpiuu");
        e1.setLastname("Mazza");
        e1.setFristname("Elpidio");
        e1.setId(1L);
        return e1;
    }


    @Test
    void getAllEmploye() {
        List<Employe> emps = new ArrayList<>();
        emps.add(createE1());
        Mockito.when(employRepository.findAll()).thenReturn(emps);
        assertNotNull(employeController.getAllEmploye(),"Doveva esserci qualcosa");

    }

    @SneakyThrows
    @Test
    void getEmployeById() {
        Mockito.when(employRepository.findById(1L)).thenReturn(Optional.of(createE1()));
        assertEquals(employeController.getEmployeById(1L).getBody(), createE1() ,"Gli employe dovevano essere uguali");
    }


    @Test
    void getEmployeByIdFail() {
        Mockito.when(employRepository.findById(1L)).thenReturn(Optional.empty());
        assertThrows(ResourceNotFoundException.class,
                () -> employeController.getEmployeById(1L),
                "Doveva lanciare l'eccezione");
    }


    @Test
    void createEmploye() {
        Mockito.when(employRepository.save(createE1())).thenReturn(createE1());
        assertEquals(employeController.createEmploye(createE1()),createE1(), "Dovevano essere uguali");
    }


    @Test
    void updateEmploye() {

    }

    @Test
    void deleteEmploye() {
    }

    @Test
    void testDeleteEmploye() {
    }

    @Test
    void generateMultipleEmployes() {
    }
}