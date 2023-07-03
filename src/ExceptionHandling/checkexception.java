package ExceptionHandling;

public class checkexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Thread.sleep(11);   //need to check first only then the compilation is done...where we actually use try/catch or throws
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

}
