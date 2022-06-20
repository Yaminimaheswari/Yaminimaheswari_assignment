package Com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
        ((ConfigurableApplicationContext) context).registerShutdownHook();
        Student obj = (Student) context.getBean("student");
        obj.getDetails();

	}

}
