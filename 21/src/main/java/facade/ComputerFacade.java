package facade;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hdd;

    public ComputerFacade() {
        memory = new Memory();
        cpu = new CPU(memory);
        hdd = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        memory.load(0, hdd.read(0, 512));
        cpu.jump(0);
        cpu.execute();
    }
}
