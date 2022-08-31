package abstractFactory.computer;

import abstractFactory.cpu.Cpu;
import abstractFactory.ram.Ram;

public interface Computer {


    void installCpu(Cpu cpu);

    void installRam(Ram ram);
    String showInfo();


    void installBrandName(String brandName);
}

