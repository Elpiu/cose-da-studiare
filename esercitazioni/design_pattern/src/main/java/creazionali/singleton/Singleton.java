package creazionali.singleton;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

public class Singleton {

    private volatile static Singleton _instance;


    //Costruttore el singleton privato
    private Singleton(){

    }

    public static Singleton getInstance(){
        if (_instance == null) {
            synchronized (Singleton.class){
                if(_instance == null){
                    _instance = new Singleton();
                }
            }
        }
        return _instance;
    }

    public String doSomething(){
        return new Faker().book().author();
    }
}
