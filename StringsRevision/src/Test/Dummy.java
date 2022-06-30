package Test;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Dummy {
	
	public static void main(String args[]) {
		
		Employee e1 = new Employee("abc", "abc", 1);
		Employee e2 = new Employee("abc", "abc", 2);
		Employee e3 = new Employee("abc", "abc", 3);
		
		List<Employee> ab = new ArrayList<Employee>();
		
		ab.add(e1);
		ab.add(e2);
		ab.add(e3);
		
//		Double avgAge = ab
//		        .stream()
//		        .collect(Collectors.averagingInt(Employee::getAge));
//		     System.out.println("Average age using Collectors.averagingInt: " + avgAge);
		
		double a = ab.stream().collect(Collectors.averagingInt(p -> p.age));
		
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
	}

}
