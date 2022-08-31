package factorymethod.Alarm;

import java.util.Objects;

public class SmsService extends DefaultChannel {
    @Override
    public Channel createChannel() {
        System.out.println("[SMS] 채널 생성완료.");
        return new SmsChannel();
    }

    @Override
    public void push() {
        System.out.println("============[SMS] 푸시 완료.=======");
    }


    @Override
    public void validationCheck(UserInfo userInfo) {
        if(Objects.isNull(userInfo.getPhone())){
            throw new IllegalArgumentException("유저객체가 null");
        }
        System.out.println("[SMS]  발송시 Validation Check");
    }
}
