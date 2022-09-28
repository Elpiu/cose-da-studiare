import javax.tools.ToolProvider;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Date;

public class TestSystemPack {








    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        /*
        try {
            Process p = r.exec("ipconfig");
            System.out.println("PID: " +p.pid());
            System.out.println(p.info());
        }
        catch (Exception exec){
            exec.printStackTrace();
        }
        */
        Object o = new Date();
        Class c = o.getClass();
        System.out.println(c);
        Method[] methods = c.getMethods();

        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].toString());

            if(methods[i].getParameters().length >0)
                System.out.print("Parameters >>>");

            for(Parameter p :methods[i].getParameters())
                System.out.print(" "+ p.getType().getName() + " ");
        }
        System.out.println();
        System.out.println(new Date(5000).compareTo(new Date(5000)));

    }





}
