package Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueStudentCity {
//	public static void main(String[] args) throws Exception {
//	    List<Person> persons =
//	        Arrays.asList(
//	            new Person("Max", 18),
//	            new Person("Peter", 23),
//	            new Person("Pamela", 23),
//	            new Person("David", 12));   
//	    
//	    List<Person> filtered =
//	        persons
//	            .stream()
//	            .filter(p -> p.name.startsWith("P"))
//	            .collect(Collectors.toList());
//
//	    System.out.println(filtered);    // [Peter, Pamela]
//	  }
	
	public static void main(String[] args) {
		List<Student> s1 = Arrays.asList(new Student("sneha", "mumbai"),
				new Student("megha", "nagpur"),
				new Student("shreya", "puna"),
				new Student("radha", "mumbai"),
				new Student("kamal", "nagpur"),
				new Student("radha", "mumbai"));
		
		List<Student> traders = 
		      
		        s1.stream()
                
                .filter(trader -> trader.getCity().equals("mumbai"))
                .distinct()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
		                    
		    System.out.println(traders);
		

	}
	
	
}

