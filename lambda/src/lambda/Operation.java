package lambda;
@FunctionalInterface
interface Arithemetic{
int operation(int a,int b);
}

public class Operation {
	public static void main(String[] args)
	{
		//add operation
		Arithemetic addition = (a,b) -> (a+b);
	System.out.println("Addition =>"+ addition.operation(20,40));
	
	//sub operation
			Arithemetic substraction = (a,b) -> (a-b);
			System.out.println("Substraction=>"+ substraction.operation(80,40));
			
			//mul operation
			Arithemetic multiplication = (a,b) -> (a*b);
			System.out.println("Multiplication =>"+ multiplication.operation(20,40));
			
			//div operation
			Arithemetic division = (a,b) -> (a/b);
			System.out.println("Division =>"+ division.operation(80,40));
	}

}
