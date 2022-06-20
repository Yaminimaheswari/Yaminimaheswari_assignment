package Com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Q3Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("bank.xml");
		BankAccount bankacc=(BankAccount) context.getBean("bankac");
		bankacc.showDetails();
		bankacc.showingDetails();


	}

}
