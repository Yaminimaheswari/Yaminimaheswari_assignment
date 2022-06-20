package Com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Contextmain {

	public static void main(String[] args) {
	        
		ApplicationContext context = new ClassPathXmlApplicationContext("tenbean.xml");
	        ContextAwareExample contextAwareExample = (ContextAwareExample) context.getBean("contextAware");
	        contextAwareExample.display();

	        ContextAwareExample contextAwareExample1 = (ContextAwareExample) context.getBean("contextAware1");
	        contextAwareExample1.display();
	    }

	}


