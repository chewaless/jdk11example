package jdk11example;

import java.util.Arrays;
import java.util.List;

public class ListToArrayExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Arjun","Shankar","Javed");
		String [] namesArr = names.toArray(String[] :: new);
		
		for(String name : namesArr) {
			System.out.println(name);
		}		
	}
}
