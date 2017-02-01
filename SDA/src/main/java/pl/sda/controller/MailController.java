package pl.sda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.sda.model.Mail;
import pl.sda.service.MailService;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class MailController {

	@Autowired
	private MailService mailService;

	@RequestMapping(value = "days.do", method = POST)
	public void get(@ModelAttribute("mail") Mail mail) {
	mailService.save(mail);

	}
}
