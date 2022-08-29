package creazionali.factory;

public class CoinFactory {

    public static Coin getCoin(CoinType type){
        return type.getConstructor().get();
    }


    public static void main(String[] args) {
        System.out.println("Making coins....");
        Coin c1 = CoinFactory.getCoin(CoinType.GOLD);
        Coin c2 = CoinFactory.getCoin(CoinType.COPPER);
        System.out.println("Prima moneta: "+c1.getDescription());
        System.out.println("Seconda moneta: "+c2.getDescription());

    }
}


