package abstractFactory.parts;

import abstractFactory.cpu.Cpu;
import abstractFactory.ram.Ram;

public interface BrandPartsFactory {

    String createBrandName();
    Cpu createCpu();
    Ram createRam();
}
