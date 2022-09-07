package builder.after;

import java.time.LocalDate;

public interface TourPlanBuilder {

    TourPlanBuilder title(String title);

    TourPlanBuilder startDate(LocalDate startDate);

    TourPlanBuilder whereStay(String stay);

    TourPlanBuilder addPlan(int day, String plan);

    TourPlan getPlan();

}
