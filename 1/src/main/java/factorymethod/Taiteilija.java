package factorymethod;

public class Taiteilija extends AterioivaOtus {
    @Override
    public Juoma createJuoma() {
        return new Viini();
    }
}
