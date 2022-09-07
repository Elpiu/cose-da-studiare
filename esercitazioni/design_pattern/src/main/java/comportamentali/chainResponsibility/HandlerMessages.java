package comportamentali.chainResponsibility;

public class HandlerMessages extends RequestHandler{


    public HandlerMessages(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request req) {
        if(!req.isHandled() &&
                req.getRequestType().equals(RequestType.INVIOMESS)){
            System.out.println("Gestisco la richiesta: "+ this.toString());
            req.markHandled();
            System.out.println("Richiesta gestita con successo" + this.toString());
        }
        else super.handleRequest(req);
    }
}
