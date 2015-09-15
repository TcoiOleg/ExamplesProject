package ru.patterns.facade;

/**
 * User: 1
 * Date: 09.09.15
 */

// Facade
public class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    private long BOOT_ADDRESS = 32423423L;
    private long BOOT_SECTOR = 232l;
    private int SECTOR_SIZE = 2;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        System.out.println("Computer starting!");
        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }

    class CPU {
        public void freeze() {  }
        public void jump(long position) { }
        public void execute() {}
    }

    class Memory {
        public void load(long position, byte[] data) {  }
    }

    class HardDrive {
        public byte[] read(long lba, int size) { return new byte[0]; }
    }
}
