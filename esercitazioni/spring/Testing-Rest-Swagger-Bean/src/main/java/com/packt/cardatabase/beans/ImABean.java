package com.packt.cardatabase.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ImABean {

    public String getWhatIAm(){
        return "Hello I'm a bean";
    }

    public String doStuff(String input, int value){
        return input + value + " Done!";
    }

    public boolean isNumberEven(Integer number) {
        return number % 2 == 0;
    }
}
