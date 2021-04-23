package adapter;

public class SquareImpl implements Square {
    @Override
    public void printSquare() {
        String box = "    .+------+     \n" +
                "  .' |    .'|    \n" +
                " +---+--+'  |   \n" +
                " |   |  |   |   \n" +
                " |  ,+--+---+   \n" +
                " |.'    | .'    \n" +
                " +------+' ";
        System.out.println(box);
    }
}
