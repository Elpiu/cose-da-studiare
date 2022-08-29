package creazionali.factory;

import lombok.Data;

@Data
public class CopperCoin implements Coin{
    static final String DES = "Moneta di rame";

    @Override
    public String getDescription() {
        return DES;
    }
}