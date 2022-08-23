package creazionali.abstractFactory;

public class ClientCode {

    private static Dialog dialog;

    public static void main(String[] args) {
        //Configurazione
        String configurazioneAttuale = "Windows";
        switch (configurazioneAttuale){
            case "Windows" :
                dialog = new WindowsDialog();
                break;
            case "Browser" :
                dialog = new HtmlDialog();
                break;
            default:
                throw new IllegalArgumentException();
        }

        dialog.renderWindow();

    }

}
