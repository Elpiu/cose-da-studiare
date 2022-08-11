package com.packt.cardatabase.web;


import com.packt.cardatabase.beans.Cane;
import com.packt.cardatabase.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/simple")
public class SimpleController {

    private int numeroChiamata = 0;

    @Autowired
    private SimpleService simpleService;

    @Qualifier("caneBean")
    @Autowired
    private Cane cane1;

    @Qualifier("caneBean")
    @Autowired
    private Cane cane2;


    @GetMapping("/")
    public String service1(){
        return "Ciao belli " +simpleService.transformFullName(1L);
    }

    @GetMapping("/ciao")
    public String service2(){
        numeroChiamata++;
        if (numeroChiamata % 2 == 0)
            return "Primo Cane -> Nome del cane: "+cane1.getClassicWord() +" cane1 count: "+ cane1.getCountWord() +" cane2 count: "+ cane2.getCountWord();
        else
            return "Secondo Cane -> Nome del cane: "+cane2.getClassicWord() +" cane1 count: "+ cane1.getCountWord() +" cane2 count: "+ cane2.getCountWord();

    }

}
