package udemy_course;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		int value =0;
		Scanner sc = new Scanner(System.in);
		do {
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		 value = sc.nextInt();
		 //sc.close();
		}
		//System.out.println("Entered num is :- "+value);
		while(value!=5);
		{
			//System.out.println("Enter the num :- ");
			//value = sc.nextInt();
			//System.out.println("entered num is now"+value);
		}
		System.out.println("Got 5");
		sc.close();
	
	}

}
