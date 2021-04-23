package adapter;

public class Main {

    public static void main(String[] args) {
        Circle circle = new CircleImpl();
        Square square = new SquareImpl();

        Square circleAdapter = new CircleAdapter(circle);

        square.printSquare();
        testSquare(circleAdapter);


    public static void testSquare(Square square) {
        square.printSquare();
    }
}
