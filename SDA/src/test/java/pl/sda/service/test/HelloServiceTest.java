package pl.sda.service.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pl.sda.model.Hello;
import pl.sda.service.HelloService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/applicationContext.xml")
public class HelloServiceTest {

	@Autowired
	private HelloService helloService;
	
	@Test
	public void shouldGetHelloById() {
		Hello hello = helloService.getById(1L);
		Assert.assertNotNull(hello);
	}
	
	@Test
	public void shouldGetHelloList() {
		List<Hello> list = helloService.getAll();
		Assert.assertNotNull(list);
	}
}
