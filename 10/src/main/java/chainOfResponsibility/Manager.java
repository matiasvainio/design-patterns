package chainOfResponsibility;

public class Manager extends Handler {

    public void handle(Request request) {
        double allowed = 0.5;
        double percentage = request.getAmount() / request.getSalary();

        if (percentage < allowed)
            System.out.println(this.getClass().getSimpleName());
        else
            super.handle(request);
    }
}
