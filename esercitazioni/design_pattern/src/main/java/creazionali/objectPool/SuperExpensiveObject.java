package creazionali.objectPool;

import java.util.concurrent.atomic.AtomicInteger;

public class SuperExpensiveObject {

    private static final AtomicInteger counter =
            new AtomicInteger(0);

    private final int id;

    public SuperExpensiveObject(){
        this.id= counter.incrementAndGet();
        //Simula il loading
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "SuperExpensiveObject{" +
                "id=" + id +
                '}';
    }
}
