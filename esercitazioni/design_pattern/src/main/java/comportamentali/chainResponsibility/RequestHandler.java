package comportamentali.chainResponsibility;

import java.util.ArrayList;
import java.util.List;

public abstract class RequestHandler {
    private final RequestHandler next;
    protected static List<Request> listaRichiesteNonGestite = new ArrayList<>();

    public RequestHandler(RequestHandler next){
        this.next = next;
    }

    public void handleRequest(Request req){
        if(next != null){
            next.handleRequest(req);
        }
    }

    public List<Request> getListaRichiesteNonGestite() {
        if(next != null)
            return next.getListaRichiesteNonGestite();
        return listaRichiesteNonGestite;
    }

}
