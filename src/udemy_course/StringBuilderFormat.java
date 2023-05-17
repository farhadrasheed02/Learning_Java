package udemy_course;

public class StringBuilderFormat {

	public static void main(String[] args) {
			
	String str = "";
	str +="My name is farhad";
	str +="I am 10 years of old";
	str +="I live in Delhi";
	System.out.println(str);
	///String Builder 
	
	StringBuilder sb = new StringBuilder();
	sb.append("My Name is Farhad").append(" And I am working as a professional");
	System.out.println(sb.toString());
	System.out.printf("I am working as Engineer and My age is %d",25);
	}

}
