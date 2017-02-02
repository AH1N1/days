package pl.sda.service;

/**
 * Created by RENT on 2017-02-01.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.dao.MailDao;
import pl.sda.repo.MailRepo;
import pl.sda.model.Mail;

@Service
public class MailService {
    @Autowired
    private MailDao mailDAo;

    public void save(Mail mail) {
        Mail tmpMail = null;
        if (null != mail.getMail()) {
            tmpMail = mailDAo.getByMail(mail.getMail());
            if (null == tmpMail)
                mailDAo.save(mail);
        }
    }


}

