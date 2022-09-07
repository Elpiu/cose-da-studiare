package comportamentali.chainResponsibility;

import java.util.ArrayList;

public class App {


    public static void main(String[] args) throws InterruptedException {
        RequestHandler chain = new HandlerMessages(
                new HandlerError(new HandlerUp(new HandlerDefault()))
        );
        RequestHandler chain2= new HandlerMessages(
                new HandlerError(new HandlerUp(null))
        );
        ArrayList<Request> listaRichieste = new ArrayList<>(){{
           add(new Request(RequestType.INVIOMESS, "Starting..."));
           add(new Request(RequestType.INVIOERROR, "Wait until load is finisched..."));
           add(new Request(RequestType.INVIOMESS, "Ready..."));
           add(new Request(RequestType.INVIODOWN, "Pressed Down..."));
           add(new Request(RequestType.INVIODOWN, "Pressed Down..."));
           add(new Request(RequestType.INVIOUP, "Pressed Up..."));
           add(new Request(RequestType.INVIOUP, "Pressed Up..."));
           add(new Request(RequestType.INVIOERROR, "To close press X..."));
           add(new Request(RequestType.INVIOMESS, "Closing..."));
           add(new Request(RequestType.INVIOMESS, "Closed"));
           add(new Request(RequestType.INVIOERROR, "Press Start to Play!"));
        }};

        for (Request req : listaRichieste) {
            chain.handleRequest(req);
            Thread.sleep(500);
        }

        System.out.println("Richieste non gestite");
        for (Request r : chain.getListaRichiesteNonGestite()){
            System.out.println(r.toString());
        }
        /*
        for (Request req : listaRichieste) {
            chain2.handleRequest(req);
            Thread.sleep(500);
        }
        System.out.println("Richieste non gestite");
        for (Request r : chain2.getListaRichiesteNonGestite()){
            System.out.println(r.toString());
        }
        */
    }


}
