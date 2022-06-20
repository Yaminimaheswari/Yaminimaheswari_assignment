package Com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("human.xml");
        human humanBeing = (human) context.getBean("Human");
        gender gender =humanBeing.getG();
        phone no=humanBeing.getP();
        System.out.println(gender);
        System.out.println(no);
        System.out.println(humanBeing);
    }
}

	



