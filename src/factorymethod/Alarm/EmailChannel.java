package factorymethod.Alarm;

public class EmailChannel implements Channel{
    @Override
    public void disPlayName() {
        System.out.println("이메일 채널입니다.");
    }

    private String emailAddr;
    private String emailCompany;

    @Override
    public String toString() {
        return "EmailChannel{" +
                "emailAddr='" + emailAddr + '\'' +
                ", emailCompany='" + emailCompany + '\'' +
                '}';
    }
}
