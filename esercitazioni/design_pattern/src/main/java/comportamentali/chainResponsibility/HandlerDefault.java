package comportamentali.chainResponsibility;

import java.util.ArrayList;
import java.util.List;

public class HandlerDefault extends RequestHandler{

    public HandlerDefault() {
        super(null);
        listaRichiesteNonGestite = new ArrayList<>();
    }

    public void handleRequest(Request req) {
        if(!req.isHandled()){
            listaRichiesteNonGestite.add(req);
            System.out.println("Richiesta catturata dall'ultimo nodo della catena");
        }
    }

    public List<Request> getListaRichiesteNonGestite() {
        return listaRichiesteNonGestite;
    }
}
