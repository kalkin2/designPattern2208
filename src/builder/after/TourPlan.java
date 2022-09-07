package builder.after;

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
