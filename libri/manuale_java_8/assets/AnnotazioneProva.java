import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

@DaCompletare(
        assegnatoA = "Antonio",
        descrizione = "Fai quello che devi!",
        priorita = DaCompletare.Priorita.MEDIA
)
public class AnnotazioneProva {


    @Serie(Serie.Alfabeto.A)
    public void doQualcosa(int par1, String par2){

    }

    @Marker
    public void doQualcosaAltro(int ...aa){
        System.out.println(Arrays.stream(aa).sum());
    }

    //Bla Bla Bla

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        System.out.println("Ciao");
        Class c = Class.forName("AnnotazioneProva");
        Arrays.asList(c.getAnnotations()).forEach( s -> System.out.println(s));

        Method[] methods = AnnotazioneProva.class.getMethods();
        Method m = AnnotazioneProva.class.getMethod("doQualcosaAltro", int[].class);
        Annotation a = m.getAnnotation(Marker.class);

        System.out.println("wee");
    }

}
