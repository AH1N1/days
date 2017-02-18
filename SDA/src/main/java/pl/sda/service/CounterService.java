package pl.sda.service;

import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.dao.DayDao;
import pl.sda.model.Counter;
import pl.sda.model.Day;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Woj on 2017-01-31.
 */
@Service
public class CounterService {
    @Autowired
    private DayDao dayDao;


//    public  Date today(){
//        return new Date(System.currentTimeMillis());
//    }
//
//    public  long getDateDiff(java.util.Date date1, java.util.Date date2, TimeUnit timeUnit) {
//        long diffInMillies = date2.getTime() - date1.getTime();
//        return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
//    }

    public Integer getDaysLeft(LocalDate date, TimeUnit timeUnit) {

        LocalDate now = LocalDate.now();
        Integer result = new Integer(Days.daysBetween(now, date).getDays());
        return result;
    }

//    public LocalDate getNextLocalDate() {
//
//        return dayDao.getNextLocalDate();
//    }

    public Date getNextDate() {

        return dayDao.getNextDate();
    }

    public Counter getCounter() {
        Counter result = new Counter();
        LocalDate next = getNextLocalDate();
        result.setNextDay(next);
        result.setToday(LocalDate.now());
        result.setDaysLeft(getDaysLeft(next, TimeUnit.DAYS));
//
        return result;

    }

    public LocalDate getNextLocalDate() {
        //Calendar calendar = new GregorianCalendar();
        List<Day> list = dayDao.getAll();
        System.out.println(list);
        if (0 == list.size()) {
            System.out.println("empty list");
            return null;
        }
        LocalDate result = null;
        for (Day day :
                list) {
            if (LocalDate.now().isBefore(LocalDate.fromDateFields(day.getDate()))) {
                result = LocalDate.fromDateFields(day.getDate());
            }
            System.out.println(result);
        }

        return result;
    }

//    public Date date(){
//        Calendar calendar = new GregorianCalendar()
//
//        List<Day> list = dayDao.getAll();
//        for (Day day:list
//             ) {
//            if (daysLeft(calendar.getTime(),day))
//
//        }
//
//        return null;
//    }
//
//    private static int daysLeft(Calendar day1, Calendar day2){
//        Calendar dayOne = (Calendar) day1.clone(),
//                dayTwo = (Calendar) day2.clone();
//
//        if (dayOne.get(Calendar.YEAR) == dayTwo.get(Calendar.YEAR)) {
//            return Math.abs(dayOne.get(Calendar.DAY_OF_YEAR) - dayTwo.get(Calendar.DAY_OF_YEAR));
//        } else {
//            if (dayTwo.get(Calendar.YEAR) > dayOne.get(Calendar.YEAR)) {
//                //swap them
//                Calendar temp = dayOne;
//                dayOne = dayTwo;
//                dayTwo = temp;
//            }
//            int extraDays = 0;
//
//            int dayOneOriginalYearDays = dayOne.get(Calendar.DAY_OF_YEAR);
//
//            while (dayOne.get(Calendar.YEAR) > dayTwo.get(Calendar.YEAR)) {
//                dayOne.add(Calendar.YEAR, -1);
//                // getActualMaximum() important for leap years
//                extraDays += dayOne.getActualMaximum(Calendar.DAY_OF_YEAR);
//            }
//
//            return extraDays - dayTwo.get(Calendar.DAY_OF_YEAR) + dayOneOriginalYearDays ;
//        }
//    }

}
