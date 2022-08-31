package factorymethod.Alarm;

public class AlarmController {

    public static void main(String[] args) {

        UserInfo smsUserInfo  = new UserInfo();
        smsUserInfo.setPhone("01096556150");


        UserInfo emailUserInfo  = new UserInfo();
        emailUserInfo.setEmail("kalkin2@naver.com");


        AlarmController controller = new AlarmController();

        controller.sendSvc(new EmailService(), emailUserInfo);
        controller.sendSvc(new SmsService(), smsUserInfo);
    }

    public void sendSvc(MessegeSvc messegeSvc, UserInfo userInfo){
        messegeSvc.send(userInfo);

    }




}
