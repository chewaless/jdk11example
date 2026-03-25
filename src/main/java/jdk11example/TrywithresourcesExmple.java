package jdk11example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TrywithresourcesExmple {

	public static void main(String[] args) {
		try {
			BufferedReader reader1 = new BufferedReader(new FileReader("./README.md"));
			 /*try (reader1) {
            while(reader1.ready()){
                System.out.println(reader1.readLine());
            }
        }*/
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       

	}

}
