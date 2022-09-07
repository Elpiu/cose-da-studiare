package comportamentali.command;

public class Client {


    public static void main(String[] args) {
        //Esegui azione 1 e 2, undo dell'azione 2, do azione 3 e do azione 2
        Command commands[] = new Command[]{
                new Command() {
                    @Override
                    public void doCommand() {
                        System.out.println("azione 1 eseguita");
                    }

                    @Override
                    public void undoCommand() {
                        System.out.println("azione 1 rimossa");
                    }
        },
                new Command() {
                    @Override
                    public void doCommand() {
                        System.out.println("azione 2 eseguita");
                    }

                    @Override
                    public void undoCommand() {
                        System.out.println("azione 2 rimossa");

                    }
                },
                new Command() {
                    @Override
                    public void doCommand() {
                        System.out.println("azione 3 eseguita");
                    }

                    @Override
                    public void undoCommand() {
                        System.out.println("azione 3 rimossa");

                    }
                }
        };
        Esecutore exec = new Esecutore();
        //azione 1
        exec.esegui(commands[0]);
        //azione 2
        exec.esegui(commands[1]);
        //undo azione 2
        exec.undoLastEsecuzione();
        //azione 3
        exec.esegui(commands[2]);
        //azione 2
        exec.esegui(commands[1]);

    }
}
