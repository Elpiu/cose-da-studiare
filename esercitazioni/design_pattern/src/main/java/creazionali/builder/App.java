package creazionali.builder;

public class App {



    public static void main(String[] args) {
        NewHero hero = new NewHero.Builder(new Profession(), "Elpiu")
                .withArmor(new Armor())
                .withWeapon(new Weapon())
                .build();

        System.out.println(hero);
        NewHero hero2 = new NewHero.Builder(new Profession(),"Antonio")
                .withHairColor(new HairColor())
                .withWeapon(new Weapon())
                .build();
        System.out.println(hero2);


    }



}
