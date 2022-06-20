package Com.Spring;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springmain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
        Customer cust1 = (Customer) context.getBean("Customer");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        cust1.showDetails();

	}

}
