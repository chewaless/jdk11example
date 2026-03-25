package jdk11example;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class FilesExample {
	public static void main(String[] args) {
		Path path = Paths.get("sample.txt");
		
		try {
		// Write to a file
		Files.writeString(path, "Hello, Java 11!");
		
		// Read from a file
		String content = Files.readString(path);
		System.out.println(content); // "Hello, Java 11!"
		} catch (IOException e) {
		e.printStackTrace();
		}
	}
}
