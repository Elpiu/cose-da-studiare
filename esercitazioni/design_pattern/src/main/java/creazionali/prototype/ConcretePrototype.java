package creazionali.prototype;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Data
public class ConcretePrototype implements IPrototype{

    private static AtomicLong id = new AtomicLong(1);
    private long myId;
    private String field1;
    private String field2;
    private String field3;
    private ArrayList<Integer> list;


    public ConcretePrototype(String field1,String field2,String field3){
        setField1(field1);
        setField2(field2);
        setField3(field3);
        list = new ArrayList<>();
        setMyId(id.getAndIncrement());
    }
    public ConcretePrototype(IPrototype prototype){

        ConcretePrototype cp = (ConcretePrototype) prototype;
        setField1(cp.getField1());
        setField2(cp.getField2());
        setField3(cp.getField3());
        ArrayList newList = new ArrayList<>();
        newList.addAll(((ConcretePrototype) prototype).getList());
        setList(newList);
        setMyId(id.getAndIncrement());
    }

    @Override
    public IPrototype clone() {
        return new ConcretePrototype(this);
    }
}
