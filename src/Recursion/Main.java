package Recursion;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) {
		System.out.println("Enter the number for factorial ..");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		factorial(a);  //recursion 
		System.out.println(factorial(a));
		System.out.println(a);
		sc.close();
	}
	public static int factorial(int value) {
		
		if(value==1)
		{
			return 1;
		}
		return factorial(value-1)*value;
	}

}
