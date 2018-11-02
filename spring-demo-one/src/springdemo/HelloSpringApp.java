package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//spring configuration 
		 ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrive bean 
		Coach theCoach = context.getBean("myCoach",Coach.class);
		CricketCoach ccoach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println("development branch deneme");
		context.close();
	}

}
