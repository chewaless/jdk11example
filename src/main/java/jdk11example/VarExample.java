package jdk11example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VarExample {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		//numbers.forEach((var number) -> {System.out.println(number);});
		
		List<String> list = List.of("a", "b", "c");
		//list.forEach((var item) -> System.out.println(item));
		
		List<Integer> numbers1 = Arrays.asList(3, 5, 2, 6, 1, 4);
       // numbers1.sort((var a, var b) -> b.compareTo(a));
        System.out.println(numbers1);
		
		//Stream.of("Mark", "David", "Joe").map((var name) -> name.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);


	}

}
