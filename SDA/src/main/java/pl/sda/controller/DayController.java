package pl.sda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.sda.Adapters.DayAdapter;
import pl.sda.model.Counter;
import pl.sda.model.Day;
import pl.sda.model.Mail;
import pl.sda.service.CounterService;
import pl.sda.service.DayService;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
public class DayController {

	@Autowired
	private DayService dayService;
	@Autowired
	private CounterService counterService;


	@RequestMapping(value = "days.do", method = GET)
	public String day(Model model, @RequestParam(required = false) Long id) {
		if (null==id){
			List<DayAdapter> list = dayService.getAllDayAdapters();
			Mail mail = new Mail();
			for (DayAdapter d:
				 list	) {
				System.out.println(d.getDate());

			}
			Counter counter = counterService.getCounter(); ////to mzoe nie dzialac
			model.addAttribute("ALL_DAYS", list);
			model.addAttribute("MAIL",mail);
			model.addAttribute("COUNTER",counter); ////to moze nie dzialac
			return "days";
		}
		else {

			DayAdapter day = dayService.getDayAdapterById(id);
			model.addAttribute("SINGLE_DAY", day);
			System.out.println(System.currentTimeMillis());
			return "day";
		}

	}
}
