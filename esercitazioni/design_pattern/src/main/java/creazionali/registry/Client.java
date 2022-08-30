package creazionali.registry;

import com.github.javafaker.Faker;

import java.util.ArrayList;

public class Client {


    public static void main(String[] args) {
        Faker faker = new Faker();
        ArrayList<Customer> list = new ArrayList<>(){{
            for (int i = 0; i < 20; i++) add(new Customer(faker.idNumber().validSvSeSsn(),faker.name().fullName()));
        }};
        ArrayList<String> ids = new ArrayList<>();
        CustomerRegistry registry = new CustomerRegistry();
        for(Customer customer: list) {
            registry.addCustomer(customer);
            ids.add(customer.getId());
        }
        System.out.println(ids);
        System.out.println(registry.getCustomer(ids.get(2)));
        System.out.println(registry.getCustomer(ids.get(4)));
        System.out.println(registry.getCustomer(ids.get(6)));

    }
}
