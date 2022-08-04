package com.baeldung;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PasswordController {

    @Autowired
    public PasswordServiceImpl passService;

    @GetMapping("/")
    public String home(){
        return "<h1>"+passService.algorithm()+"</h1>";
    }

}
