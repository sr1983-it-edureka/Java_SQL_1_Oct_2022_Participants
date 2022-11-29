package mapdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		for (int index = 1; index <=6; index ++) {
			numbers.add(index);
		}

//		demo1(numbers);
		demo3(numbers);
	}
	
	static void demo1(List<Integer> numbers) {
		
		// (t) -> t%2 != 0
		List<Integer> newList = 
		numbers.stream().map((number ) -> {
			return number * number;
		}).collect(Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(newList);
	}

	static void demo2(List<Integer> numbers) {
		
		// (t) -> t%2 != 0
		List<Integer> newList = 
		numbers.stream().map((number ) -> {
			return number * number;
		}).collect(Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(newList);
	}

	static void demo3(List<Integer> numbers) {
		
		// (t) -> t%2 != 0
		List<Employee> newList = 
		numbers.stream().map((number ) -> {
			
			return new Employee(number);
			
		}).collect(Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(newList);
	}
	
}

class Employee{
	
	private Integer id;

	public Employee(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String toString() {
		return "Employee [" + id + "]";
	}
}
