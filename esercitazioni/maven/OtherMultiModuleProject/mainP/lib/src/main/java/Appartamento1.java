public class Appartamento1 extends Casa{

    private String via;
    private int numeroPorte;
    private int numeroFinestre;
    private int inizioCostruzione;


    private static double MOLTIPLICATORE = 1.56;
    public static int APPARENCY = 2;
    public static int CONFORT = 6;


    public Appartamento1(String via, int numeroPorte,
            int numeroFinestre, int inizioCostruzione, String proprietario, double valoreCasa, double valoreAffitto) {
        super(proprietario, valoreCasa, valoreAffitto);
        this.via=via;
        this.numeroPorte = numeroPorte;
        this.numeroFinestre = numeroFinestre;
        this.inizioCostruzione = inizioCostruzione;

    }

    @Override
    public String getProprietario() {
        return super.proprietario;
    }

    @Override
    public void setProprietario(String proprietario) {
        this.proprietario = "Propietà di: "+proprietario;
    }

    @Override
    public void setValoreCasa(double valoreCasa) {
        this.valoreCasa = (valoreCasa/100)*MOLTIPLICATORE*APPARENCY*CONFORT;
    }

    @Override
    public void setValoreAffitto(double valoreAffitto) {
        super.valoreAffitto = valoreAffitto*CONFORT;
    }

    @Override
    public String getVia() {
        return this.via;
    }

    @Override
    public int inizioCostruzione() {
        return inizioCostruzione;
    }

    @Override
    public int numeroFinestre() {
        return numeroFinestre;
    }

    @Override
    public int numeroPorte() {
        return numeroPorte;
    }
}
