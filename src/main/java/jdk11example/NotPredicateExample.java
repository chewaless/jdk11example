package jdk11example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotPredicateExample {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Hello", "  ", "programming", "   ");
		list.forEach(e -> System.out.println("element : " + e));
		
		//using not to exclude the objects
		List<String> listWithoutBlanks = list.stream()
		  .filter(Predicate.not(String::isBlank))
		  .collect(Collectors.toList());
		
		listWithoutBlanks.forEach(e -> System.out.println("element after : " + e));
		
	}
}