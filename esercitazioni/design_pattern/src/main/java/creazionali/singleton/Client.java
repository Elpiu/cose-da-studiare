package creazionali.singleton;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Client {



    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
        System.setOut(out);

        ArrayList<AccessToSingleton> list = new ArrayList<>(){{
            for (int i = 1; i <= 20 ; i++)
                add(new AccessToSingleton(i));
        }};
        for(AccessToSingleton i: list)
            i.run();
        System.out.println("I thread sono stati lanciati!");

    }


}
