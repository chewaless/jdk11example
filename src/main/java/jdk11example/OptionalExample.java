package jdk11example;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		
		Optional value = Optional.empty();
		
		System.out.println(value.isEmpty());
		
		value = Optional.of("Ram");
		
		System.out.println(value.isEmpty());
		
	}	
}
