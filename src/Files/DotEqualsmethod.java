package Files;

import java.util.Scanner;

public class DotEqualsmethod {
	public static String farhad = "farhad";
	public static String farhad1 = "farhad";

	public static void main(String[] args) {
		System.out.println("Enter the first String");
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		System.out.println("Enter the second String ");
		//Scanner sc1 = new Scanner(System.in);
		String b=sc.next();
		System.out.println(a.equals(b));
		System.out.println(farhad.equals(farhad1));
		sc.close();
	}

}
