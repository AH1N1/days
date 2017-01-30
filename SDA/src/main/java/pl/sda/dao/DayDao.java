package pl.sda.dao;

import org.springframework.stereotype.Repository;
import pl.sda.model.Day;

import java.util.List;

/**
 * Created by RENT on 2017-01-30.
 */
@Repository
public class DayDao extends AbstractDao<Day> {
    public DayDao(Day t) {
        super(t);
    }
}
