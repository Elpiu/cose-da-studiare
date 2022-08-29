package creazionali.factory;

import lombok.Data;

@Data
public class GoldCoin implements Coin{
    static final String DES = "Moneta d'oro";
    @Override
    public String getDescription() {
        return DES;
    }
}