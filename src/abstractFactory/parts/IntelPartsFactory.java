package abstractFactory.parts;

import abstractFactory.Client;
import abstractFactory.cpu.Cpu;
import abstractFactory.cpu.IntelCpu;
import abstractFactory.parts.BrandPartsFactory;
import abstractFactory.ram.Ram;
import abstractFactory.ram.SamsungRam;

public class IntelPartsFactory implements BrandPartsFactory {
    @Override
    public String createBrandName() {
        return "INTEL";
    }

    @Override
    public Cpu createCpu() {
        return new IntelCpu();
    }

    @Override
    public Ram createRam() {
        return new SamsungRam();
    }


}
