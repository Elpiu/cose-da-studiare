package creazionali.singleton;

import java.util.Random;
import java.util.Timer;

class AccessToSingleton implements Runnable{
    private int id;
    public AccessToSingleton(int id){
        this.id=id;
    }

    @Override
    public void run() {
        System.out.println(Singleton.getInstance().doSomething());
        try {
            Thread.sleep(new Random().nextInt(500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Singleton.getInstance().doSomething());
        System.out.println("Thread "+id+" Fine!");
    }
}