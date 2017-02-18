package pl.sda.conspects;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Woj on 2017-02-04.
 */
public class time {

    public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
        long diffInMillies = date2.getTime() - date1.getTime();
        return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
    }


    public void between(){


    }
}
