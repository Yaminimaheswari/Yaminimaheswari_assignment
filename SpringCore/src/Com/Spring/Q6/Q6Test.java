package Com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Q6Test {

	public static void main(String[] args) {
		
			ApplicationContext context= new ClassPathXmlApplicationContext("beanss6.xml");
			DbConfiguration Configuration = (DbConfiguration)context.getBean("dbConfiguration");
	         Configuration.display();
			
		}

	}


