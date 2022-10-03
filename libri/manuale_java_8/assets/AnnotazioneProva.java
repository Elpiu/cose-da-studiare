import java.lang.annotation.Annotation;
import java.lang.annotation.Native;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

@DaCompletare(
        assegnatoA = "Antonio",
        descrizione = "Fai quello che devi!",
        priorita = DaCompletare.Priorita.MEDIA
)
public class AnnotazioneProva {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        methodMarketInvocate("ToRunAtStart", AnnotazioneProva.class);
    }

    /**
     * Invoca i metodi annotati con nameOfMarker della classe classC
     * @param nameOfMarker Nome dell'annotatore
     * @param classC Classe dove fare la lookUp
     */
    public static void methodMarketInvocate(String nameOfMarker, Class classC){
        if(nameOfMarker == null) nameOfMarker = "ToRunAtStart";
        if(classC == null) return;
        if(classC.getName() == "") classC = AnnotazioneProva.class;

        Method[] methods = classC.getMethods();
        for(Method m : methods){
            List<Annotation> a = Arrays.asList(m.getAnnotations());
            String finalNameOfMarker = nameOfMarker;
            a.forEach(annotation ->{
                if(annotation.annotationType().getName().equals(finalNameOfMarker)) {
                    try {
                        m.invoke(new Object());
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }
    }

    @Deprecated
    @ToRunAtStart(priority = 1)
    public static void startUp1(){
        System.out.println("System starting....");
    }
    @ToRunAtStart(priority = 2)
    public static void startUp2(){
        System.out.println("Mark Started.");
    }
    @ToRunAtStart(priority = 3)
    public static void startUp3(){
        System.out.println("End starting.");
    }


    @Serie(Serie.Alfabeto.A)
    public void doQualcosa(int par1, String par2){}
    @Marker
    public void doQualcosaAltro(int ...aa){System.out.println(Arrays.stream(aa).sum());}

    //Bla Bla Bla
    public static void annotazioniProva() throws ClassNotFoundException, NoSuchMethodException {
        System.out.println("Ciao");
        Class c = Class.forName("AnnotazioneProva");
        Arrays.asList(c.getAnnotations()).forEach( s -> System.out.println(s));

        Method[] methods = AnnotazioneProva.class.getMethods();
        Method m = AnnotazioneProva.class.getMethod("doQualcosaAltro", int[].class);
        Annotation a = m.getAnnotation(Marker.class);
        System.out.println("wee");
    }
}
