package Com.Spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpelMain {
	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext();
	BookLibrary library=(BookLibrary) context.getBean("bookLibrary");
	List<Book> allBooks=library.getAllBooks();
	for(Book book:allBooks)
	{
		System.out.println(book.getBookId()+"\t"+book.getBookName());
	}
	Book book=library.getGetFirstBook();
	System.out.println(book.getBookId()+"\t"+book.getBookName());

}

}
