package udemy_course;
import java.util.Scanner;
class Student
{
	String name;
	int age;
	double marks;
	public  Student()
	{
	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the name of the Student");
//	name = sc.next();
//	System.out.println("Enter the age of the Student");
//	age = sc.nextInt();
//	System.out.println("Enter the marks of the students");
//	marks=sc.nextDouble();
	sc.close();
	
	}
	
	}

public class MyClass {
	public static void main(String[] args) {

		Student st = new Student();
		practice pc = new practice();
		pc.speak();
//		System.out.println(st.name);
//		System.out.println(st.age);
//		System.out.println(st.marks);
	}

}
