import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Timer;

public class PassaggioParametri {




    public static void main(String[] args) {
        Date bob1 = new Date();
        System.out.println(bob1);
        doSomething(bob1);
        System.out.println(bob1);

        List<Integer> list = Arrays.asList(16,1,2,3,45,6,456,45,6234,2,34,234);
        labelCycle1:
        for (int i : list){
            labelCycle2:
            for (int j = 2 ; j < 10 ; j++){
                if (j+i < 20 ) System.out.println(j);
                else break labelCycle1;
            }
            System.out.println(i);
        }
    }

    public static void doSomething(Date data){
        data.setTime(5555555555L);
    }


}
