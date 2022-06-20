package Com.Spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testmain {

	public static void main(String[] args) {
	        AbstractApplicationContext context = new ClassPathXmlApplicationContext("life.xml");
	        context.registerShutdownHook();

	        BeanLifeCycle beanLifeCycle=(BeanLifeCycle)context.getBean("LifeCycle");
	        beanLifeCycle.display();
	    }


	}


