package abstractFactory.parts;

import abstractFactory.Client;
import abstractFactory.cpu.AmdCpu;
import abstractFactory.cpu.Cpu;
import abstractFactory.ram.Ram;
import abstractFactory.ram.SamsungRam;

public class AmdPartsFactory implements BrandPartsFactory {
    @Override
    public Cpu createCpu() {
        return new AmdCpu();
    }

    @Override
    public Ram createRam() {
        return new SamsungRam();
    }

    @Override
    public String createBrandName() {
        return "AMD";
    }
}
