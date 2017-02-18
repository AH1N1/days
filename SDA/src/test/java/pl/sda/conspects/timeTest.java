package pl.sda.conspects;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import static java.util.Calendar.DAY_OF_MONTH;
import static org.junit.Assert.assertEquals;

/**
 * Created by Woj on 2017-02-04.
 */
public class timeTest {
    @Test
    public void getDateDiff() throws Exception {
        Calendar calendar = new GregorianCalendar();

        Date d1 = calendar.getTime();
        calendar.add(DAY_OF_MONTH, 1);
        Date d2 = calendar.getTime();
        assertEquals(1, time.getDateDiff(d1, d2, TimeUnit.DAYS));
    }

}