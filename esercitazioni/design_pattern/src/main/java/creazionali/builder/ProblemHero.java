package creazionali.builder;

public class ProblemHero {

    private  Profession profession;
    private  String name;
    private  HairType hairType;
    private  HairColor hairColor;
    private  Armor armor;
    private  Weapon weapon;

    public ProblemHero(Profession profession, String name, HairType hairType, HairColor hairColor, Armor armor, Weapon weapon) {
        this.profession = profession;
        this.name = name;
        this.hairType = hairType;
        this.hairColor = hairColor;
        this.armor = armor;
        this.weapon = weapon;
    }

}
