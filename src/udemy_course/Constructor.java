package udemy_course;

import java.util.Scanner;

public class Constructor {
	private String name;
	private int age;
	 public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Constructor()
	 {
		 System.out.println("No parameter constructor");
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public void setName(String newName)
	 {
		 this.name= newName;
	 }
	 public Constructor(String name)
	 {
		 this.name=name;
		 System.out.println("Single  parameter constructor "+name);
	 }
	 public Constructor (String name,int age)
	 {
		 this.name= name;
		 this.age=age;
		 System.out.println("double parameterized called "+name+"and is "+age+" old");
	 }
	 
	public static void main(String[] args) {
		Constructor cs = new Constructor(); //always getting called (default calling of the constructor 
		
		
		//System.out.println(cs.getName());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the String ");
		String str = sc.nextLine();
		int age = sc.nextInt();
		cs.setName(str);  //
		cs.setAge(age);
		
		System.out.println(cs.getName());
		System.out.println(cs.getAge());
		Constructor cs1 = new Constructor(str);
		Constructor cs2 = new Constructor(str,age);
		//System.out.println(str);
		
		
		sc.close();
		
		
	}

}
