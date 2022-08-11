package com.packt.cardatabase.beans;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Cane implements Animale{

    private String name;
    private int numberOfFeet;
    private int countWord;
    private String classicWord;

    @Bean
    @Scope("prototype")
    public Cane caneBean(){
        return new Cane();
    }

    public Cane() {
        name = "Alex";
        numberOfFeet = 4;
        countWord = 0;
        classicWord = "Bau Bab!";
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNumberOfFeet() {
        return numberOfFeet;
    }

    @Override
    public String getClassicWord() {
        countWord +=1;
        return classicWord;
    }

    public int getCountWord() {
        return countWord;
    }

}
