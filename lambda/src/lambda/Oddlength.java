package lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;


public class Oddlength {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String> (
			Arrays.asList("Nani", "Mahi", "Muni", "sai", "sri", "Aeysha"));
		 
		Predicate<String> filter = str -> (str.length() == 3);
		
		System.out.println("Original ArrayList: " +arrayList);
		boolean value = arrayList.removeIf(filter);
		System.out.println("Returned value: " +value);
		System.out.println("ArrayList after removeIf(): " +arrayList);
		}

	}
