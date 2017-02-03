package pl.sda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sda.model.Mail;
import pl.sda.service.MailService;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class MailController {

    @Autowired
    private MailService mailService;

    @RequestMapping(value = "days.do", method = POST)
    public String get(@Valid @ModelAttribute("MAIL") Mail mail, BindingResult result) {
        System.out.println(mail);
        if (result.hasErrors()) System.out.println("error in binding result");
        else if (null != mail)
            mailService.save(mail);
        return "days";
    }
}
