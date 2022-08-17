package com.example.SpringPostgreapp.controller;

import com.example.SpringPostgreapp.model.LinguaggiProg;
import com.example.SpringPostgreapp.model.Persona;
import com.example.SpringPostgreapp.repository.LinguaggiProgRepository;
import com.example.SpringPostgreapp.repository.PersonaRepository;
import com.example.SpringPostgreapp.service.GeneratorEntitys;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/linguaggi")
public class LinguaggiController {

    @Autowired
    private LinguaggiProgRepository lRepo;
    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private GeneratorEntitys generator;

    @Operation(summary = "Genera un linguaggio a caso")
    @GetMapping("linguaggi/random")
    public ResponseEntity<LinguaggiProg> generateSinglePerson(){
        return ResponseEntity.ok().body(
                lRepo.save(generator.generateLinguaggio()));

    }

    @Operation(summary = "Aggiungi a delle persone la conoscenza di linguaggi")
    @GetMapping("linguaggi/aggiungiConoscenzaRandom")
    public List<Persona> addKnowlage(){
        return generator.aggiungiConoscenza();
    }

    @Operation(summary = "Ritorna le persone che conososcono il linguaggio")
    @PostMapping("linguaggi/foundByLenguagePersons/{nomeLinguaggio}")
    public List<Persona> foundByLinguaggio(@PathVariable(value = "nomeLinguaggio") String nomeLinguaggio){
        return  personaRepository.getPersoneWhoKnowLenguage(nomeLinguaggio);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public LinguaggiProg save(@RequestBody LinguaggiProg linguaggiProgDTO) {
        return lRepo.save(linguaggiProgDTO);
    }


    @GetMapping("/{id}")
    public LinguaggiProg findById(@PathVariable("id") Long id) {
        LinguaggiProg linguaggiProg = lRepo.findById(id).orElse(null);
        return linguaggiProg;
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        lRepo.deleteById(id);
    }


    @GetMapping
    public List<LinguaggiProg> list() {
        return lRepo.findAll();
    }


    @PutMapping("/{id}")
    public LinguaggiProg update(@RequestBody LinguaggiProg linguaggiProgDTO, @PathVariable("id") Long id) {
        return lRepo.save(linguaggiProgDTO);
    }
}
