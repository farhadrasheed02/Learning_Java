package ExceptionHandling;

public class Uncheckedexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//		 int Var = 7;
//		 System.out.println(Var/0); // unchecked/runtime exception in java (Arithmetic exception)
		 
//		 String str = null; // Null pointer Exception (also runtime exception)
//		 System.out.println(str.length());
		 
		 String[] arr = {"abc","def","ghi"};
		 System.out.println(arr[3]);   // outofbound exception 
		}
		catch(RuntimeException rex)
		{
			System.out.println(rex.toString());
		}
	}

}
