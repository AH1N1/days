package pl.sda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.sda.model.Day;
import pl.sda.model.Hello;
import pl.sda.service.DayService;
import pl.sda.service.HelloService;

@Controller
public class HelloController {

	@Autowired
	private HelloService helloService;

	@RequestMapping("hello.do")
	public String hello(Model model) {
		List<Hello> list = helloService.getAll();
		model.addAttribute("ALL_HELLO", list);
		return "hello";
	}
}
