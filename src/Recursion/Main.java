package Recursion;

public class Main {

	public static void main(String[] args) {
		int value =5;
		calculate(value);
		System.out.println(value);
	}
	public static void calculate(int value) {
		value = value-1;
		System.out.println(value);
	}

}
