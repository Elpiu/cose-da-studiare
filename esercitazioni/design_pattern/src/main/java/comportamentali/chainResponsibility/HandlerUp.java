package comportamentali.chainResponsibility;

public class HandlerUp extends RequestHandler{

    public HandlerUp(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request req) {
        if(!req.isHandled() &&
                req.getRequestType().equals(RequestType.INVIOUP)){
            System.out.println("Gestisco la richiesta: "+ this.toString());
            req.markHandled();
            System.out.println("Richiesta di UP gestita con successo" + this.toString());
        }
        else super.handleRequest(req);
    }
}
