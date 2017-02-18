package pl.sda.dao;

import org.joda.time.LocalDate;
import org.springframework.stereotype.Repository;
import pl.sda.Adapters.DayAdapter;
import pl.sda.model.Day;

import java.util.*;

/**
 * Created by RENT on 2017-01-30.
 */
@Repository
public class DayDao extends AbstractDao<Day> {
    public DayDao(Day t) {
        super(t);
    }


    public Date getNextDate() {
        Calendar calendar = new GregorianCalendar();
        List<Day> list = this.getAll();
        System.out.println(list);
        if (0 == list.size()) {
            System.out.println("empty list");
            return null;
        }
        Date result = null;
        for (Day day :
                list) {
            if (calendar.before(day)) result = day.getDate();
            System.out.println(result);
        }

        return result;
    }
//    public LocalDate getNextLocalDate() {
//        Calendar calendar = new GregorianCalendar();
//        List<Day> list = this.getAll();
//        System.out.println(list);
//        if (0 == list.size()) {
//            System.out.println("empty list");
//            return null;
//        }
//        LocalDate result = null;
//        for (Day day :
//                list) {
//            if (calendar.before(day)) result = LocalDate.fromDateFields(day.getDate());
//            System.out.println(result);
//        }
//
//        return result;
//    }

    public List<DayAdapter> getAllDayAdapters() {

        List<DayAdapter> list =new ArrayList<>();
        for (Day day :
                getAll()) {
            list.add(new DayAdapter(day));
        }
        return list;
    }
}
