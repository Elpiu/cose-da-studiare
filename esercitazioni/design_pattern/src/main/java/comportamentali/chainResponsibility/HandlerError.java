package comportamentali.chainResponsibility;

public class HandlerError extends RequestHandler{


    public HandlerError(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request req) {
        if(!req.isHandled() &&
                req.getRequestType().equals(RequestType.INVIOERROR)){
            System.out.println("Gestisco la richiesta: "+ this.toString());
            req.markHandled();
            System.out.println("Richiesta di errore gestita con successo" + this.toString());
        }
        else super.handleRequest(req);
    }
}
