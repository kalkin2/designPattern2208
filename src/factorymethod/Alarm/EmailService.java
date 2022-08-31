package factorymethod.Alarm;

import java.util.Objects;

public class EmailService extends DefaultChannel {


    @Override
    public Channel createChannel() {
        System.out.println("[EMAIL] 채널 생성완료.");
        return new EmailChannel();
    }

    @Override
    public void push() {
        System.out.println("============[EMAIL] 푸시 완료.=======");
    }




    @Override
    public void validationCheck(UserInfo userInfo) {
        if(Objects.isNull(userInfo.getEmail())){
            throw new IllegalArgumentException("유저객체가 null");
        }
        System.out.println("[EMAIL] 발송시 Validation Check");
    }
}
