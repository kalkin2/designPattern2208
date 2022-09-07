package builder.after;

import java.time.LocalDate;

public class DefaultTourBuilder implements  TourPlanBuilder{

    private String title;
    private LocalDate startDate;
    private String stay;
    private int day;
    private String msg;
    private  String plan;

    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate startDate) {
        this.startDate = startDate;
        return  this;
    }

    @Override
    public TourPlanBuilder whereStay(String stay) {
        this.stay = stay;
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String msg) {
        this.day = day;
        this.msg = msg;
        return this;
    }

    @Override
    public TourPlan getPlan() {
        System.out.println(print());
        return new TourPlan(title, startDate, stay, day, msg, plan);
    }

    public String print() {
        return "DefaultTourBuilder{" +
                "title='" + title + '\'' +
                ", startDate=" + startDate +
                ", stay='" + stay + '\'' +
                ", day=" + day +
                ", msg='" + msg + '\'' +
                ", plan='" + plan + '\'' +
                '}';
    }
}
