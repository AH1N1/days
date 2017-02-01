package pl.sda.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Woj on 2017-01-31.
 */


public class Counter {
    private Date today;

    private Date day;

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public Counter() {
    }
}