public class Podio <P,S,T>{

    private P primo;
    private S secondo;
    private T terzo;

    public Podio(P primo, S secondo, T terzo) {
        this.primo = primo;
        this.secondo = secondo;
        this.terzo = terzo;
    }

    public P getPrimo() {
        return primo;
    }

    public void setPrimo(P primo) {
        this.primo = primo;
    }

    public S getSecondo() {
        return secondo;
    }

    public void setSecondo(S secondo) {
        this.secondo = secondo;
    }

    public T getTerzo() {
        return terzo;
    }

    public void setTerzo(T terzo) {
        this.terzo = terzo;
    }

    @Override
    public String toString() {
        return "Podio{" +
                "primo=" + primo +
                ", secondo=" + secondo +
                ", terzo=" + terzo +
                '}';
    }
}
