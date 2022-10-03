import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilPackageTest {


    public static void main(String[] args) throws ParseException {
        System.out.println(LocalDate.now());
        System.out.println(YearMonth.now());
        System.out.println(LocalDate.of(1970,9,5));
        System.out.println(Instant.now());
        System.out.println("Instant now + 10 minuti: " + Instant.now().plus(10, ChronoUnit.MINUTES));
        System.out.println("Instant now - 10 minuti: " + Instant.now().minus(10, ChronoUnit.MINUTES));
        System.out.println(
                Instant.now().plus(10, ChronoUnit.MINUTES)
                        .isAfter(Instant.now())
        );
        System.out.println(YearMonth.now().isValidDay(32));
        System.out.println(ZoneId.systemDefault());
        System.out.println(ZoneId.getAvailableZoneIds());


    }

    public static void token(){
        String token = "Buongiorno a tutti, l'alunno Rossi Mario e l'alunna Maria Maria";

        Pattern p = Pattern.compile("a*b+aa}");
        Matcher m = p.matcher("bbb");
        System.out.println(m.matches());
    }

    public static void stringToken(){
        String tokenToRead = "Questo è un token da leggere. This-is-a token";
        StringTokenizer stk = new StringTokenizer(tokenToRead, ". ", false);
        while (stk.hasMoreTokens()) System.out.println(stk.nextToken());
    }

    public static void numberFormatTest() throws ParseException{
        NumberFormat nf_it = NumberFormat.getInstance(Locale.ITALIAN);
        NumberFormat nf_us = NumberFormat.getInstance(Locale.US);
        NumberFormat nf_ch = NumberFormat.getInstance(Locale.CHINA);
        String number = "25.88165";

        System.out.println(nf_it.parse(number));
        System.out.println(nf_us.parse(number));
        System.out.println(nf_ch.parse(number));

        System.out.println(Locale.getDefault());
        System.out.println(Locale.ITALIAN);

    }

    public static void propertiesFile() throws IOException  {
        FileInputStream f = new FileInputStream("resources/pp.txt");
        Properties p = new Properties();
        p.load(f);
        p.forEach((k, v) -> System.out.println(k.toString() + " " + v.toString()));
        p.setProperty("Music_Type", "Neomelodic");
        p.save(new FileOutputStream("resources/pp.txt"), "Updating...");
    }

}


