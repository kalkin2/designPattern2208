package builder.after;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

       //여러 생성자를 만들 필요없이 builder를 통해 원하는 만큼의 값 세팅이 가능.
        TourDirector tourDirector = new TourDirector();
        tourDirector.koreaTrip();
        tourDirector.cancunTrip();

        //롬복을 이용
        tourDirector.koreaTripLombokStyle();
    }
}
