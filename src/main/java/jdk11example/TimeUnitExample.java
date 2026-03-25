package jdk11example;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TimeUnitExample {

	public static void main(String[] args) {
		
		TimeUnit tu = TimeUnit.DAYS;
		
		int noOfHours = 96;
		
		long t = tu.convert(Duration.ofHours(noOfHours));
		
		System.out.println(noOfHours + " hours are " + t + " days");
		
	}	
}
