

public abstract class Casa implements Costruzione{

    protected String proprietario;
    protected double valoreCasa;
    protected double valoreAffitto;

    public Casa(String proprietario, double valoreCasa, double valoreAffitto) {
        setProprietario(proprietario);
        setValoreCasa(valoreCasa);
        setValoreAffitto(valoreAffitto);
    }

    public abstract String getProprietario();
    public abstract void setProprietario(String proprietario);

    public double getValoreCasa() {
        return valoreCasa;
    }

    public abstract void setValoreCasa(double valoreCasa);

    public double getValoreAffitto() {
        return valoreAffitto;
    }

    public abstract void setValoreAffitto(double valoreAffitto);
}
