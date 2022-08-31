package factorymethod.Alarm;

import java.util.Objects;

/**
 * 공통의 역할은 여기서 구현한다.
 */
public abstract class DefaultChannel implements MessegeSvc {

    @Override
    public void setTargetUserInfos() {
        System.out.println("[DEFAULT] userInfo Setting 완료.");
    }

}
