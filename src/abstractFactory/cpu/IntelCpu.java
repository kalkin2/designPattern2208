package abstractFactory.cpu;


public class IntelCpu implements Cpu {

    String cpuName = "Intel cpu";

    @Override
    public String getCpuName() {
        return cpuName;
    }

}
