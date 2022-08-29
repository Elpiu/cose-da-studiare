import java.util.Arrays;
import java.util.stream.Stream;

public class Varargs{

    public int sommaTutti(int... interi) {
        return Arrays.stream(interi).sum();
    }

    public static void main(String[] args) {
        Varargs a = new Varargs();
        int totale = a.sommaTutti(1,2,3,4,5,6,7,8,80,10);
        System.out.println(totale);

    }
}