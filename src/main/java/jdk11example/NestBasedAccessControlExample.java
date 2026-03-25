package jdk11example;

public class NestBasedAccessControlExample {
	private String message = "Hello from the outer class!";
	
	class NestedClass {
		void printMessage() {
		System.out.println(message);
	   }
	}
	
	public static void main(String[] args) {
		NestBasedAccessControlExample outer = new NestBasedAccessControlExample();
		NestBasedAccessControlExample.NestedClass nested = outer.new NestedClass();
		nested.printMessage();
	}
}
