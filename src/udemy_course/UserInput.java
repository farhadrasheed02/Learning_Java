package udemy_course;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc ;
		// create scanner class
		sc = new Scanner(System.in);
		System.out.println("Enter the line :");
		//taking input form the user
		String line = sc.nextLine();
		System.out.println("You have entered "+line);
		int in = sc.nextInt();
		System.out.println("YOu have entered now "+in);
		sc.close();
	}

}
