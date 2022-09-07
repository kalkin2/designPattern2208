package builder.after;

import java.time.LocalDate;

public class TourDirector {

    //빌더를 이용한 객체 생성 팩토리 역할 (Director)
    //클라이언트에서는 객체생성 부분을 숨김수 있음.

    TourPlanBuilder builder = new DefaultTourBuilder();
    public TourPlan koreaTrip() {
        return builder.title("한국")
                .startDate(LocalDate.of(2022, 1, 1))
                .getPlan();

    }

    public TourPlan cancunTrip() {
        return  builder.title("칸쿤")
                .startDate(LocalDate.of(2022, 1, 1))
                .addPlan(1, "체크인")
                .addPlan(2, "요트투어")
                .whereStay("호텔")
                .getPlan();
    }


    public TourPlanLombok koreaTripLombokStyle() {

        //Lombok
        TourPlanLombok tourPlanLombok = TourPlanLombok.builder()
                .title("한국")
                .startDate(LocalDate.of(2022, 1, 1))
                .build();
        System.out.println(tourPlanLombok);
        return  tourPlanLombok;
    }
}
