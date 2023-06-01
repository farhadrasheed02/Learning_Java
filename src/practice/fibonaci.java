package practice;

public class fibonaci {

	public static void main(String[] args) {
			 int n=7;
			 int num1=0; //declare first number as zero
			 int num2=1; // declare number as 1
			 for(int i=0;i<=n;i++)
			 {
				 System.out.print("fabonaci series is :" +num1+",");
				int nextnum= num1+num2;
				num1=num2;
				num2=nextnum;
				
			 }
	}

}
