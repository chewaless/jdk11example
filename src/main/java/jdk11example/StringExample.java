package jdk11example;

import java.util.List;
import java.util.stream.Collectors;

public class StringExample {

	public static void main(String[] args) {
		
		//isBlank(): This is a boolean method. It just returns true when a string is empty and vice-versa.
		String str1 = "";
        System.out.println(str1.isBlank());

        String str2 = "SantoshForTest";
        System.out.println(str2.isBlank());
		
        //lines(): This method is to return a collection of strings that are divided by line terminators.
        String str3 = "Santosh For Test";
        System.out.println(
            str3.lines().collect(Collectors.toList()));
        str3 = "Santosh\nFor\nTest";
        System.out.println(
            str3.lines().collect(Collectors.toList()));
        
        //repeat(n): Result is the concatenated string of original string repeated the number of times in the argument.
        String str4 = "SantoshForTest";
        System.out.println(str4.repeat(4));
        
        //stripLeading(): It is used to remove the white space which is in front of the string
        String str5 = " SantoshForTest";
        System.out.println(str5.stripLeading());
        
        //stripTrailing(): It is used to remove the white space which is in the back of the string
        String str6 = "SantoshForTest ";
        System.out.println(str6.stripTrailing());
        
        //strip(): It is used to remove the white spaces which are in front and back of the string
        String str7 = " SantoshForTest ";
        System.out.println(str7.strip());
        
        String multilineString = "Baeldung helps \n \n developers \n explore Java.";
        List<String> lines = multilineString.lines()
          .filter(line -> !line.isBlank())
          .map(String::strip)
          .collect(Collectors.toList());
        
        System.out.println(lines);

	}

}
