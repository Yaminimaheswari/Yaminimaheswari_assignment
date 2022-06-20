package Com.Spring;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {
	
	 ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
	    Customer cust1 = (Customer) context.getBean("Customer");
	    Customer cust2 = (Customer) context.getBean("Customer");
	    Customer cust4 = (Customer) context.getBean("Customer");
	    Customer cust5 = (Customer) context.getBean("Customer");

	    @Test
	    void showDetails() {
	        assertAll(
	                () -> assertEquals(cust1,cust2,"They are supposed to be equal as they come from same bean"),
	                () -> assertEquals(cust4,cust5,"They are supposed to be equal as they come from same bean")
	        );
	    }
}
