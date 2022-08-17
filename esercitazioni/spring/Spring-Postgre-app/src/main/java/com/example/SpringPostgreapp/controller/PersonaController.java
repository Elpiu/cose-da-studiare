package com.example.SpringPostgreapp.controller;

import com.example.SpringPostgreapp.model.Employe;
import com.example.SpringPostgreapp.model.Persona;
import com.example.SpringPostgreapp.repository.PersonaRepository;
import com.example.SpringPostgreapp.service.GeneratorEntitys;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class PersonaController {

    @Autowired
    private GeneratorEntitys service;

    @Autowired
    private PersonaRepository personaRepository;

    @Operation(summary = "Genera una persona a caso")
    @GetMapping("persona/genera")
    public ResponseEntity<Persona> generateSinglePerson(){
        return ResponseEntity.ok().body(
                personaRepository.save(service.generatePersona()));
    }

    @Operation(summary = "Genera delle persone casuali, number ne indica il numero (max 500)")
    @PostMapping("persona/genera/{number}")
    public List<Persona> generateMultiplePerson(@PathVariable(value = "number") int number){
        ArrayList<Persona> list = new ArrayList<>();
        if(number <= 0) return list;

        for (int i = 0; i < number && i < 500; i++) list.add(service.generatePersona());

        list = (ArrayList<Persona>) personaRepository.saveAll(list);
        return list;
    }


    @Operation(summary = "Restituisce l'eta media delle persone")
    @GetMapping("persone/etamedia")
    public int getEtaMedia(){
        return personaRepository.getEtaMedia();
    }

    @Operation(summary = "Restituisce tutte le persone")
    @GetMapping("persone")
    public List<Persona> getAll(){
        return (List<Persona>)  personaRepository.findAll();
    }

    @Operation(summary = "Restituisce tutti i codici identificativi delle persone")
    @GetMapping("persone/codici")
    public List<String> getAllCodici(){
        return (List<String>)  personaRepository.getAllCode();
    }

    @Operation(summary = "Restituisce tutti i nomi delle persone")
    @GetMapping("persone/nomi")
    public List<String> getAllNomi(){
        return (List<String>)  personaRepository.getAllName();
    }


}
