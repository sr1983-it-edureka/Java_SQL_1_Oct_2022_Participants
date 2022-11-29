package filterdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		
		for (int index = 1; index <=15; index ++) {
			numbers.add(index);
		}
		
//		demo1(numbers);
//		demo2(numbers);
		demo6(numbers);
	}
	
	static void demo1(List<Integer> numbers) {
		
		EvenNumberFilter evenFilter = new EvenNumberFilter();
		
		List<Integer>  evenNumbers = 
		numbers.stream().
			filter(evenFilter)
			.collect(Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(evenNumbers);
	}

	
	static void demo2(List<Integer> numbers) {
				
		List<Integer>  evenNumbers = 
		numbers.stream().
			filter(new Predicate<Integer>() {

				@Override
				public boolean test(Integer t) {
					
					if (t %2 != 0) {
						return true;
					}else {
						return false;
					}
				}
			
			})
		.collect(Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(evenNumbers);
	}

	
	static void demo3(List<Integer> numbers) {
		
		
		Predicate<Integer> oddPredicate = 
				new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				
				if (t %2 != 0) {
					return true;
				}else {
					return false;
				}
			}		
		};
		
		List<Integer>  evenNumbers = 
		numbers.stream().
			filter(oddPredicate)
		.collect(Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(evenNumbers);
	}
	
	
	static void demo4(List<Integer> numbers) {
		
		
		Predicate<Integer> oddPredicate = 				
				(Integer t) -> {
					
					return t%2 != 0;					
				};
		
		List<Integer>  evenNumbers = 
		numbers.stream().
			filter(oddPredicate)
		.collect(Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(evenNumbers);
	}	

	static void demo5(List<Integer> numbers) {
		
		
		Predicate<Integer> oddPredicate = 				
				(Integer t) -> t%2 != 0;					
		
		List<Integer>  evenNumbers = 
		numbers.stream().
			filter(oddPredicate)
		.collect(Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(evenNumbers);
	}	


	static void demo6(List<Integer> numbers) {
		
		
		Predicate<Integer> oddPredicate = 				
				(t) -> t%2 != 0;					
		
		List<Integer>  evenNumbers = 
		numbers.stream().
			filter(oddPredicate)
		.collect(Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(evenNumbers);
	}	

	static void demo7(List<Integer> numbers) {
				
		List<Integer>  evenNumbers = 
		numbers.stream().
			filter((t) -> t%2 != 0)
		.collect(Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(evenNumbers);
	}	
	
}



class EvenNumberFilter implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		
		if (t %2 == 0) {
			return true;
		}else {
			return false;
		}
	}		
}