package creazionali.prototype;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {


    public static void main(String[] args) {

        ConcretePrototype p = new ConcretePrototype("A", "B", "C");
        ConcretePrototype p2 = new ConcretePrototype("D", "E", "F");

        ArrayList<Integer> superList = new ArrayList<>();
        superList.addAll(Arrays.asList(1,5,54,64,86,48,47,13,1,3,48,4,3,46,86,6,6,46,46,8,8,8));
        ArrayList<Integer> superList2 = new ArrayList<>();
        superList2.addAll(Arrays.asList(5,4,5,75,454,5,5));


        p.setList(superList);
        p2.setList(superList2);
        System.out.println(p);
        System.out.println(p2);

        System.out.println("cloning");
        System.out.println("Clone of p: " + p.clone());
        System.out.println("Clone of p2: " + p2.clone());

    }
}
