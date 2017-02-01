package pl.sda.service;

/**
 * Created by RENT on 2017-02-01.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.dao.MailDao;
import pl.sda.model.Mail;

@Service
public class MailService {
    @Autowired
    private MailDao mailDao;

    public void save(Mail mail) {
        Mail tmpMail = mailDao.getByMail(mail.getMail());
        if (null == tmpMail)
            mailDao.save(mail);
    }
}

