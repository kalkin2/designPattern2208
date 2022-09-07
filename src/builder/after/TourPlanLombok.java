package builder.after;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import java.time.LocalDate;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@ToString
public class TourPlanLombok {


    private String title;
    private LocalDate startDate;
    private String stay;
    private int day;
    private String msg;
    private String plan;


    @Override
    public String toString() {
        return "TourPlan{" +
                "title='" + title + '\'' +
                ", startDate=" + startDate +
                ", stay='" + stay + '\'' +
                ", day=" + day +
                ", msg='" + msg + '\'' +
                ", plan='" + plan + '\'' +
                '}';
    }
}
