package pl.sda.model;





import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by RENT on 2017-02-01.
 */
@Entity
@Table(name = "mail")
public class Mail implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;

     @NotEmpty   @Email
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

    @Override
    public String toString() {
        return "Mail{" +
                "id=" + id +
                ", mail='" + mail + '\'' +
                '}';
    }
}
