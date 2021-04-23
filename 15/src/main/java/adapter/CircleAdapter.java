package adapter;

public class CircleAdapter implements Square {
    Circle circle;

    public CircleAdapter(Circle circle) {
        this.circle = circle;
    }

    @Override
    public void printSquare() {
        circle.printCircle();
    }
}
