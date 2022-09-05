import javax.naming.InvalidNameException;

public class SwitchConEnum {
    public enum Pap{
        UNO, DUE, TRE;
    }

    public static String doSwitch(Pap valore){
     switch (valore){
         case UNO -> {
             System.out.println("Si");
             break;
         }
         case DUE -> {
             System.out.println("Sii");
             break;
         }
         case TRE -> {
             System.out.println("Siii");
             break;
         }
         default -> throw new IllegalArgumentException("Valroe non consentito");
     }
        return "null";
    }

    public static void main(String[] args) {
        doSwitch(Pap.DUE);
    }
}
