package xiaopangzi.wechart.shop.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import xiaopangzi.wechart.shop.service.UserService;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml",  
        "classpath:spring-dataSource.xml"})
public class JuintServiceTest {

	@Autowired
	UserService userService;
	
	@Test
	public void test() {
		System.out.println(userService.selectByPrimaryKey(1));
	}

}
