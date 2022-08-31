package abstractFactory.computer;

import abstractFactory.cpu.Cpu;
import abstractFactory.ram.Ram;

public class NoteBook implements Computer{


    private Cpu cpu;
    private Ram ram;
    private String brandName ;

    public void installCpu(Cpu cpu) {
        this.cpu = cpu;
    }


    public void installRam(Ram ram) {
        this.ram = ram;
    }


    @Override
    public String showInfo() {
        return "IntelNoteBook{" +
                "cpu='" + cpu.getCpuName() + '\'' +
                ", ram='" + ram.getRamName() + '\'' +
                ", brandName='" + brandName + '\'' +
                '}';
    }

    @Override
    public void installBrandName(String brandName) {
        this.brandName = brandName;
    }
}
