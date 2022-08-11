package controller;


import exception.ResourceNotFoundException;
import model.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.EmployRepository;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/")
public class EmployeController {

    @Autowired
    private EmployRepository empoRepo;


    @GetMapping("employes")
    public List<Employe> getAllEmploye(){
        return (List<Employe>) empoRepo.findAll();
    }


    @GetMapping("employes/{id}")
    public ResponseEntity<Employe> getEmployeById(@PathVariable(value = "id") Long employeId ) throws ResourceNotFoundException {
        Employe employe = empoRepo.findById(employeId).orElseThrow(
                () -> new ResourceNotFoundException("Employe non trovato con id:"+employeId)
        );
        return ResponseEntity.ok().body(employe);
    }


    @PostMapping("employes/save")
    public Employe createEmploye(@RequestBody Employe employe){
        return empoRepo.save(employe);
    }


    @PutMapping("employes/{id}")
    public ResponseEntity<Employe> updateEmploye(@PathVariable(value = "id") Long employeId,
                                                 @Valid @RequestBody Employe employeDetails) throws ResourceNotFoundException {
        Employe employe = empoRepo.findById(employeId).orElseThrow(
                () -> new ResourceNotFoundException("Employe non trovato con id:"+employeId)
        );

        employe.setEmail(employeDetails.getEmail());
        employe.setFristname(employeDetails.getFristname());
        employe.setLastname(employeDetails.getLastname());
        return ResponseEntity.ok().body(empoRepo.save(employe));
    }


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





}
