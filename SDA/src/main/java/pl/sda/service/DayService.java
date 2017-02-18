package pl.sda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.Adapters.DayAdapter;
import pl.sda.dao.DayDao;
import pl.sda.model.Day;

import java.util.List;

/**
 * Created by RENT on 2017-01-30.
 */
@Service
public class DayService {

    @Autowired
    private DayDao dayDao;

    public List<Day> getAll() {
        return dayDao.getAll();
    }

    public Day getById(Long id) {
        return dayDao.getById(id);
    }

    public List<DayAdapter> getAllDayAdapters() {
        return dayDao.getAllDayAdapters();
    }

    public DayAdapter getDayAdapterById(Long id) {
        return new DayAdapter(getById(id));
    }
}

