package facade;

public class CPU {
    private Memory memory;
    private int position;

    public CPU(Memory memory) {
        this.memory = memory;
    }

    public void freeze() {
        System.out.println("CPU freeze");
    }

    public void jump(int position) {
        this.position = position;
        System.out.println("CPU at pos " + position);
    }

    public void execute() {
        System.out.println("CPU executing " + memory.getData(position));
    }
}
