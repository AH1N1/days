package pl.sda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.sda.model.Day;
import pl.sda.model.Hello;
import pl.sda.model.Mail;
import pl.sda.service.DayService;

import java.util.List;

@Controller
public class DayController {

	@Autowired
	private DayService dayService;

//	@RequestMapping("days.do")
//	public String days(Model model) {
//		List<Day> list = dayService.getAll();
//		model.addAttribute("ALL_DAYS", list);
//		return "days";
//	}
	@RequestMapping("days.do")
	public String day(Model model, @RequestParam(required = false) Long id) {
		if (null==id){
			List<Day> list = dayService.getAll();
			Mail mail = new Mail();
			model.addAttribute("ALL_DAYS", list);
			model.addAttribute("MAIL",mail);
			return "days";
		}
		else {

			Day day = dayService.getById(id);
			model.addAttribute("SINGLE_DAY", day);
			return "day";
		}

	}
}
