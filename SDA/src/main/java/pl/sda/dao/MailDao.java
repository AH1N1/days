package pl.sda.dao;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import pl.sda.model.Mail;

import java.util.List;

/**
 * Created by RENT on 2017-02-01.
 */
@Repository
public class MailDao extends AbstractDao<Mail> {

    public MailDao(Mail t) {
        super(t);
    }

    public Mail getByMail(String mail) {
        String queryString = "from mail where mail='"+mail+"'";
        SQLQuery query = getSession().createSQLQuery(queryString);
        List results = query.list();
        if (0==results.size()) return null;
        return (Mail) results.get(1);

    }
}
