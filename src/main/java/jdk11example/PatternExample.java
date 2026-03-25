package jdk11example;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		
		Predicate<String> p = Pattern.compile("xyzz").asMatchPredicate();
		
		System.out.println(p.test("xyzz"));
		
	}
}
