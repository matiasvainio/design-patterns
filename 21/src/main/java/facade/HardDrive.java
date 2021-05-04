package facade;

public class HardDrive {
    private String[] data;

    public HardDrive() {
        data = new String[8];
        data[0] = "boot.img";
        data[1] = "sda1";
        data[2] = "sda2";
    }

    public String read(int sector, int size) {
        return data[sector];
    }
}
