package builder.before;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        //아래처럼 만들경우의 단점..
        //규격화 안됨,
        //강제화 안되어 있음,
        //객체가 불안정한 상태로 만들어 질수 있다.
        //생성자를 만드는 과정이 장황해 질수 있다.
        LocalDate startDate = LocalDate.of(2021,01,01);
        TourPlan shortTrip = new TourPlan("롱비치", startDate,"리조트",0,"blar","3");

        TourPlan simpleTour = new TourPlan("칸쿤" , startDate);

    }
}
