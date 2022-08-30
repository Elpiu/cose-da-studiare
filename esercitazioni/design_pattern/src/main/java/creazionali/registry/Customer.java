package creazionali.registry;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Customer {

    private final String id;
    private final String name;


    public Customer(String id, String name){
        this.id=id;
        this.name=name;
    }


}
