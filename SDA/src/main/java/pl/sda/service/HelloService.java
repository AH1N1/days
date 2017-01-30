package pl.sda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.sda.dao.HelloDao;
import pl.sda.model.Hello;

@Service
public class HelloService {
	
	@Autowired
	private HelloDao helloDao;
	
	public List<Hello> getAll() {
		return helloDao.getAll();
	}
	
	public Hello getById(Long id) {
		return helloDao.getById(id);
	}
}
