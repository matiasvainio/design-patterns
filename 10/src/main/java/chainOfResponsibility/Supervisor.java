package chainOfResponsibility;

public class Supervisor extends Handler {

    public void handle(Request request) {
        double allowed = 0.2;
        double percentage = request.getAmount() / request.getSalary();

        if (percentage < allowed)
            System.out.println(this.getClass().getSimpleName());
        else
            super.handle(request);
    }
}
