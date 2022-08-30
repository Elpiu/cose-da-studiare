package creazionali.registry;

import java.util.HashMap;

public class CustomerRegistry {

    private HashMap<String,Customer> listaCustomers;


    public CustomerRegistry(){
        listaCustomers = new HashMap<>();
    }

    public Customer addCustomer(Customer customer){
        listaCustomers.put(customer.getId(),customer);
        return customer;
    }

    public Customer getCustomer(String id){
        return listaCustomers.get(id);
    }
}
