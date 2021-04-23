package adapter;

public class CircleImpl implements Circle {
    @Override
    public void printCircle() {
        String circle = "         , - ~ ~ ~ - ,\n" +
                "     , '               ' ,\n" +
                "   ,                       ,\n" +
                "  ,                         ,\n" +
                " ,                           ,\n" +
                " ,                           ,\n" +
                " ,                           ,\n" +
                "  ,                         ,\n" +
                "   ,                       ,\n" +
                "     ,                  , '\n" +
                "       ' - , _ _ _ ,  '";
        System.out.println(circle);
    }
}
