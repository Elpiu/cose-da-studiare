package creazionali.valueObject;

public class Client {

    public static void main(String[] args) {
        HeroStat h1 = HeroStat.valueOf(50,15,60);
        HeroStat h2 = HeroStat.valueOf(10,75,30);
        HeroStat h3 = HeroStat.valueOf(50,15,60);


        System.out.println(
                h1+"\n"+h2+"\n"+h3
        );
        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));

    }

}
