package udemy_course;
import java.util.Scanner;
class Student
{
	String name;
	int age;
	double marks;
	public void Details()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name of the Student");
	name = sc.next();
	System.out.println("Enter the age of the Student");
	age = sc.nextInt();
	System.out.println("Enter the marks of the students");
	marks=sc.nextDouble();
	sc.close();
	
	}
	}

public class MyClass {

	public static void main(String[] args) {
		//System.out.println();
		
		//creating an object of Student Class
		Student st = new Student();
		System.out.println(st.name);
		System.out.println(st.age);
		System.out.println(st.marks);

	}

}
