package creazionali.valueObject;


import lombok.Value;

@Value(staticConstructor = "valueOf")
public class HeroStat {
    int forza;
    int intelligenza;
    int fortuna;
}
