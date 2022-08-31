package factorymethod.Alarm;

public class SmsChannel implements Channel{
    private String smsCompany;
    private String phoneNo;

    @Override
    public void disPlayName() {
        System.out.println("sms 채널입니다.");

    }
}
