package com.example.SpringPostgreapp.controller;


import com.example.SpringPostgreapp.repository.EmployRepository;
import com.example.SpringPostgreapp.exception.ResourceNotFoundException;
import com.example.SpringPostgreapp.model.Employe;
import com.github.javafaker.Faker;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/")
public class EmployeController {

    private Faker faker = new Faker();

    @Autowired
    private EmployRepository empoRepo;

    @Operation(summary = "Restituisce tutti gli employes")
    @GetMapping("employes")
    public List<Employe> getAllEmploye(){
        return (List<Employe>) empoRepo.findAll();
    }

    @Operation(summary = "Restituisce i dati dell'employe con quell'id")
    @GetMapping("employes/{id}")
    public ResponseEntity<Employe> getEmployeById(@PathVariable(value = "id") Long employeId ) throws ResourceNotFoundException {
        Employe employe = empoRepo.findById(employeId).orElseThrow(
                () -> new ResourceNotFoundException("Employe non trovato con id:"+employeId)
        );
        return ResponseEntity.ok().body(employe);
    }

    @Operation(summary = "Inserisce il nuovo employe")
    @PostMapping("employes/save")
    public Employe createEmploye(@RequestBody Employe employe){
        return empoRepo.save(employe);
    }

    @Operation(summary = "Modifica i dati dell'employes con quell'id")
    @PutMapping("employes/{id}")
    public ResponseEntity<Employe> updateEmploye(@PathVariable(value = "id") Long employeId,
                                                 @Valid @RequestBody Employe employeDetails) throws ResourceNotFoundException {
        Employe employe = empoRepo.findById(employeId).orElseThrow(
                () -> new ResourceNotFoundException("Employe non trovato con id:"+employeId)
        );

        employe.setUsername(employeDetails.getUsername());
        employe.setEmail(employeDetails.getEmail());
        employe.setFristname(employeDetails.getFristname());
        employe.setLastname(employeDetails.getLastname());
        employe.setAge(employeDetails.getAge());
        return ResponseEntity.ok().body(empoRepo.save(employe));
    }

    @Operation(summary = "Elimina l'employes con quell'id")
    @DeleteMapping("employes/{id}")
    public Map<String, Boolean> deleteEmploye(@PathVariable(value = "id") Long employeId) throws ResourceNotFoundException {
        Employe employe = empoRepo.findById(employeId).orElseThrow(
                () -> new ResourceNotFoundException("Employe non trovato con id:"+employeId)
        );
        empoRepo.delete(employe);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

    @Operation(summary = "Elimina tutti gli employes")
    @DeleteMapping("employes/deleteAll")
    public Map<String, Boolean> deleteEmploye() throws ResourceNotFoundException {
        List<Employe> employe = empoRepo.findAll();
        employe.forEach((item) -> empoRepo.delete(item));
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

    /**
     * Genera con valori casuali degli employes
     * @param number numero delle entity da generare
     * @return emplyes generati
     */
    @Operation(summary = "Genera degli emplyes casuali, number ne indica il numero (max 500)")
    @PostMapping("employes/generate/{number}")
    public List<Employe> generateMultipleEmployes(@PathVariable(value = "number") int number){
        ArrayList<Employe> list = new ArrayList<>();
        if(number <= 0) return list;

        for (int i = 0; i < number && i < 500; i++) {
            Employe e = new Employe();
            e.setEmail(faker.internet().emailAddress());
            e.setFristname(faker.name().firstName());
            e.setLastname(faker.name().lastName());
            e.setUsername(faker.name().username()); //Genera Username non validi
            e.setAge(faker.random().nextInt(17,90));
            list.add(e);
        }
        list = (ArrayList<Employe>) empoRepo.saveAll(list);
        return list;
    }


}
