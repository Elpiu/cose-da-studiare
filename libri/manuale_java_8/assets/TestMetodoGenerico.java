import java.util.*;

public class TestMetodoGenerico {

    public static void main(String[] args) {
        ArrayList<Date> c1 = new ArrayList<>(){{
            add(new Date());
            add(new Date());
            add(new Date());
            add(new Date());
        }};
        ArrayList<Podio<Integer,Integer,String>> c2 = new ArrayList<>(){{
           add(new Podio<>(10,15482, "Primo Posto"));
           add(new Podio<>(7,18975, "Secondo Posto"));
           add(new Podio<>(4,23555, "Terzo Posto"));

        }};

        System.out.println("//////////////////////////////////////////////////");
        stampoQualsiasiCosa(c1);
        System.out.println("//////////////////////////////////////////////////");
        stampoQualsiasiCosa(c2);
        System.out.println("//////////////////////////////////////////////////");
        ArrayList<Number> n = new ArrayList<>(){{add(32L); add(50.555F); add(20) ;}};
        upperBound(n);
        System.out.println("//////////////////////////////////////////////////");
        ArrayList<Number> n2 = new ArrayList<>(){{add((short)20); add((short)10); add((short)55);}};
        lowerBound(n2);
    }
    public static void stampoQualsiasiCosa(List<?> list){
        Iterator<?> it =  list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    // Utilizzo della wildcard di tipo generico. Upperbound limitata verso l'alto
    // Object >> Number >> Byte-Integer-Double-Float-Short-Long
    public static void upperBound(List <? extends Number> numeroDiQualsiasiTipo){
        stampoQualsiasiCosa(numeroDiQualsiasiTipo);
    }
    // Utilizzo della wildcard di tipo generico. Lowerbound limitata verso il basso
    public static void lowerBound(List <? super Short> numeroLimitatoDiTipo){
        stampoQualsiasiCosa(numeroLimitatoDiTipo);
    }
}
