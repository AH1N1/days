package pl.sda.Adapters;

import org.joda.time.LocalDate;
import pl.sda.model.Day;

import java.util.Date;

/**
 * Created by Woj on 2017-02-06.
 */
public class DayAdapter {
    private Day day;

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public DayAdapter() {
    }

    public DayAdapter(Day day) {
        this.day = day;
    }

    public Long getId() {
        return day.getId();
    }

    public void setId(Long id) {
        day.setId(id);
    }

    public LocalDate getDate() {


        return LocalDate.fromDateFields(day.getDate());
    }

    public void setDate(LocalDate date)
    {
        day.setDate(date.toDate());

    }

    public String getName() {
        return day.getName();
    }

    public void setName(String name) {
        day.setName(name);
    }

    public String getDescription() {
        return day.getDescription();
    }

    public void setDescription(String description) {
        day.setDescription(description);
    }

}
