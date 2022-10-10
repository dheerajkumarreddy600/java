package streamAPI;

import java.util.*;
import java.util.stream.Collectors;
public class Streams {
	  public static void main(String[] args) {  
	        List<Company> list = new ArrayList<Company>();  
	        //Adding Products  
	        list.add(new Company(11,"HP",25000));  
	        list.add(new Company(22,"Dell",30000));  
	        list.add(new Company(33,"1+",28000));  
	        list.add(new Company(44,"Sony",28000));  
	        list.add(new Company(55,"Apple",90000)); 
	        //filter Example..
	        List<Integer> list1 =list.stream()  
	                                     .filter(p -> p.salary > 28000)
	                                     .map(p->p.salary)       
	                                     .collect(Collectors.toList());  
	        System.out.println(list1);  
	        //Filtering and Iterating Collection 
	        list.stream()  
            .filter(C -> C.salary == 30000)  
            .forEach(C -> System.out.println(C.name)); 
	        //Count() usage
	        long count = list.stream()  
                    .filter(C->C.salary<30000)  
                    .count();  
	        System.out.println(count);
	        
	        //list-set
	        Set<Integer> SalaryList =   
	                list.stream()  
	                .filter(C->C.salary < 29000)     
	                .map(C->C.salary)  
	                .collect(Collectors.toSet());   
	            System.out.println(SalaryList);           
	    }  
}

