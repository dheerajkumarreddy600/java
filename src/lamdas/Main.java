package lamdas;

import java.util.ArrayList;
import java.util.function.Consumer;
interface Drawable{  
    public void draw();  
}  
interface Sayable{  
    public String say();  
}  

interface Addable{  
    int add(int a,int b);  
}  

public class Main {

	 public static void main(String[] args) {
	  ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    numbers.forEach( (n) -> { System.out.println(n); } );
	    //Consumer interface to store a lambda expression in a variable:
	    Consumer<Integer> method = (n) -> { System.out.println(n); };
	    numbers.forEach( method );
	    //LambdaExpressionExample1
	    int width=10;  
        Drawable d2=()->{  
            System.out.println("Drawing "+width);  
        };  
        d2.draw();
        
      //LambdaExpressionExample2
        Sayable s=()->{  
            return "LambdaExpressionExample2";  
        };  
        System.out.println(s.say());  
       // Multiple Parameters
        Addable ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));  
	 }
}
