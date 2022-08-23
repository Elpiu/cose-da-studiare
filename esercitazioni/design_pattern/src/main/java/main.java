import com.github.javafaker.Faker;
import static java.lang.System.out;


public class main {


    public static void main(String[] args) {
        Faker faker = new Faker();

        out.print(faker.app().author());
    }
}
