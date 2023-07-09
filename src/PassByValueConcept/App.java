package PassByValueConcept;

public class App {
	public static void main(String[] args) {
		int value;
		value = 7;
		System.out.println(" 2. Printing the value as :"+value);
		App.show(value);
		System.out.println(" 3. Printing the value as :"+value);
//	 ===================================================================//
		
		Person person = new Person("farhad", value);
		System.out.println(person.toString());
		
		App.show(person);
		System.out.println(person);
		
	}
	public static  void show(int value)
	{
		System.out.println("1. Printing the value as "+value);
		value =value+1;
		System.out.println("4. Printing the vaue as "+value);
	}
	
	public static void show(Person person)
	{
		System.out.println("2. Person value is "+person);
		
		Person person1 =new Person("Hasu",10);
		System.out.println(person1);
	}
}
