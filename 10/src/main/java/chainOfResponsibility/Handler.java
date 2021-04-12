package chainOfResponsibility;

public abstract class Handler {

    private Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void handle(Request request) {
        if (this.successor != null) {
            successor.handle(request);
        }
    }
}
