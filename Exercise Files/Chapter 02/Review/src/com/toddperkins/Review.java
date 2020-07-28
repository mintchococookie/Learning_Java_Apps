package com.toddperkins;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Review {

	public static void main(String[] args) {
		try {
			loadFile("file.txt");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
		
		static void loadFile(String filename) throws IOException {
			Path file = FileSystems.getDefault().getPath("", filename);
			List<String> lines = Files.readAllLines(file);
//			for(int i = 0; i < lines.size(); i++) { // Way 1
//				System.out.println(lines.get(i));
//			}
//			lines.forEach((str) -> System.out.println(str)); // Way 2
			lines.forEach(System.out::println); // Way 3
			
		}
		
//		
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter your name: ");
//		String name = scanner.nextLine();
//		System.out.println("Hello! " + name);
//		scanner.close();
		
		
		
		
		
		
//		MyClass mc = new MyClass();
//		mc.myMethod();
//		mc.myInt = 10;
//		
//		System.out.println(mc.myInt);
//		
		
		
		
//		boolean statement1 = 1 == 1;
//		boolean statement2 = 1 < 1;
//		if (statement1 || statement2) {
//			System.out.println("Statement is True");
//		} else {
//			System.out.println("Statement is False");
//		}
//		
		
		
		
		
		
		
//		String[] breakfast = new String[3];
//		breakfast[0] = "Egg";
//		breakfast[1] = "Milk";
//		breakfast[2] = "Cereal";
//
//		for(int i =0; i < breakfast.length; i++) {
//			System.out.println(breakfast[i]);
//		}
//		
//		
//		
//		
//		printS("Static method"); //Review.printS
//		
//		Review myReview = new Review(); //creating instance to run instance method
//		myReview.print("instance method");
//	}
//
//	
//	void print(String data) { // void: its not returning any data.
//		System.out.println(data);
//	}
//	
//	static void printS(String data) {
//		System.out.println(data);
	
	
}
