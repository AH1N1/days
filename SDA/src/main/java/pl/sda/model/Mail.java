package pl.sda.model;

import org.springframework.stereotype.Service;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.*;

/**
 * Created by RENT on 2017-02-01.
 */
@Entity
@Table(name = "mail")
public class Mail implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String mail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Mail() {
    }
}
