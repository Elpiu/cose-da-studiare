package com.packt.cardatabase.exception;

public class NotFoundException extends IllegalArgumentException{

    public static final String NOTFOUND = "Dato non presente.";

    public NotFoundException(String s) {
        super(s);
    }
}
