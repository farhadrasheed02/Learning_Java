package lambdaExpressions;

interface Military
{
	public void Camp(String camp, int n, double d);
	//public void Solider(int n);
}

// Lambda expression provides implementation of functional interface. An interface which has only one abstract method is called functional interface.
public class OneParameterLambda extends FirstProgram {

	public static void main(String[] args) {
		
		Military mil = (camp, a, b) ->   // if I add another function in interface it will voilate the functional interface concept.. so shows erors
		{
			
			
				System.out.println("I am working in the camp "+camp + " with "+a+" Soliders in "+b+" Baricates");
			
		};
		mil.Camp("Punjab",10,2.5);
	}

}
