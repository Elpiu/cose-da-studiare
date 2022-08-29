package creazionali.objectPool;

import java.util.HashSet;
import java.util.Set;

public abstract class ObjectPool<T>{

    private final Set<T> available = new HashSet<>();
    private final Set<T> inUse = new HashSet<>();

    protected abstract T create();

    public synchronized  T checkOut(){
        if (available.isEmpty()){
            available.add(create());
        }
        T instance = available.iterator().next();
        available.remove(instance);
        inUse.add(instance);
        return instance;
    }

    public synchronized void checkIn(T insance){
        inUse.remove(insance);
        available.add(insance);
    }

    @Override
    public synchronized String toString() {
        return String.format("Pool available=%d inUse=%d", available.size(), inUse.size());
    }

}
