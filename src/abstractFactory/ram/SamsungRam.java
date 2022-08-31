package abstractFactory.ram;

public class SamsungRam implements Ram{
    String ramName = "삼성 8Gb";

    @Override
    public String getRamName() {
        return ramName;
    }
}
