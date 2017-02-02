package pl.sda.dao;

import org.hibernate.SQLQuery;
import pl.sda.model.Hello;
import pl.sda.model.Mail;


import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by RENT on 2017-02-02.
 */
public class MailDao extends AbstractDao<Mail> {

    public MailDao(Mail t) {
        super(t);
    }

    public Mail getByMail(String mail) {
        String queryString = "select * from mail where mail='" + mail + "'";

                SQLQuery query = getSession().createSQLQuery(queryString);
                List<Mail> results = query.list();

        if (0 == results.size()) return null;
        return results.get(0);

    }
}
