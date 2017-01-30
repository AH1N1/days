package pl.sda.dao;

import org.springframework.stereotype.Repository;

import pl.sda.model.Hello;

@Repository
public class HelloDao extends AbstractDao<Hello> {

	public HelloDao(Hello t) {
		super(t);
	}
}
