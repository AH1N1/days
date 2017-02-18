package pl.sda.model;

import org.joda.time.LocalDate;
import org.springframework.cglib.core.Local;

import java.io.Serializable;


/**
 * Created by Woj on 2017-01-31.
 */


public class Counter implements Serializable {
    private LocalDate today;

    private LocalDate nextDay;

    private Integer daysLeft;

    public Integer getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(Integer daysLeft) {
        this.daysLeft = daysLeft;
    }

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }

    public LocalDate getNextDay() {
        return nextDay;
    }

    public void setNextDay(LocalDate nextDay) {
        this.nextDay = nextDay;
    }

    public Counter() {
    }
}