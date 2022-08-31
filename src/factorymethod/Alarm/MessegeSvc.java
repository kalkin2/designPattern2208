package factorymethod.Alarm;

public interface MessegeSvc {



    //공통로직
    default void send(UserInfo userInfo){
        //채널 생성
        createChannel();
        //validationCheck
        validationCheck(userInfo);
        //타겟정보 생성
        setTargetUserInfos();
        //푸시 발송
        push();
    }

    Channel createChannel();

    void push();

    void setTargetUserInfos();

    void validationCheck(UserInfo userInfo);

}
