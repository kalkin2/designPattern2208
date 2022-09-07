package builder.before;

import java.time.LocalDate;

public class TourPlan {

    private String title;
    private LocalDate startDate;
    private String stay;
    private int day;
    private String msg;
    private String plan;

    public TourPlan(String title, LocalDate startDate, String stay, int day, String msg, String plan) {
        this.title  = title;
        this.startDate = startDate;
        this.stay = stay;
        this.day = day;
        this.msg = msg;
        this.plan  = plan;
    }

    public TourPlan(String title, LocalDate startDate) {
        this.title  = title;
        this.startDate = startDate;
    }

    public void setTitle(String title) {
         this.title = title;

    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setWhereToStay(String stay) {
        this.stay = stay;

    }

    public void addPlan(int day, String msg) {
        this.day = day;
        this.msg = msg;

    }
}
