package Com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Quizmain {

	public static void main(String[] args) {
		ApplicationContext quizContext= new ClassPathXmlApplicationContext("quiz.xml");
        Question ques1 = (Question) quizContext.getBean("Question1");
        System.out.println(ques1);

	}

}
