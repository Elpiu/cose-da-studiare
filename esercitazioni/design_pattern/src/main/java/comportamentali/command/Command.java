package comportamentali.command;

public abstract class Command{

    private String nomeComando;

    public Command() {
        this.nomeComando = nomeComando;
    }

    public abstract void doCommand();
    public abstract void undoCommand();

    @Override
    public String toString() {
        return "Command{" +
                "nomeComando='" + nomeComando + '\'' +
                ", azione=" +
                '}';
    }
}
