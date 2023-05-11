	package udemy_course;

import java.util.Scanner;

public class SwitchClass {
	
		public static void main(String[] args) {
			int value=0;
			Scanner sc =new Scanner(System.in);
			System.out.println("enter the number");
			value = sc.nextInt();
			switch(value) {
			case 1 :
				System.out.println("Sunday");
				break;
			case 2 :
				System.out.println("Monday");
				break;
			case 3 :
				System.out.println("Tuesday");
				break;
			case 4 :
				System.out.println("Wednesday");
				break;
			case 5 :
				System.out.println("Thursday");
				break;
			case 6 :
				System.out.println("Friday");
			case 7 :
				System.out.println("Saturday");
				break;
				default:
					System.out.println("Not Matching");
					
			
			}
			sc.close();
		}
	
	}
