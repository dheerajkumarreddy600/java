package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface

interface Square { 
    int calculate(int x); 
} 

public class Main {
	 public static void main(String args[]) 
	    { 
	        int a = 5; 
	        Square s = (int x) -> x * x; 
	        int ans = s.calculate(a); 
	        System.out.println(ans); 
	        
	        
	        List<String> names = Arrays.asList( 
	                "apple", "mango", "banana", "grapes", "oranges"); 
	            Predicate<String> p = (I) -> I.startsWith("m"); 
	            
	            for (String name : names) { 
	                if (p.test(name)) 
	                    System.out.println(name); 
	            } 

	            Function<String, Integer> functionalInterface=(str)->str.length();
	            int name = functionalInterface.apply("Dheerajreddy");
	            System.out.println(name);
	    } 
}
