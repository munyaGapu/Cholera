package zw.co.mike.chol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CholeraAlertSystem {

	public static void main(String[] args) {
		ApplicationContext cx=new ClassPathXmlApplicationContext();

		SpringApplication.run(CholeraAlertSystem.class, args);
	}

}
