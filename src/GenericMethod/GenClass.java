package GenericMethod;

public class GenClass<T> {
	private T t;
	
	private void add(T t)
	{
		this.t=t;
	}
	public  T get()
	{
		return t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenClass<String> str = new GenClass<>();
		str.add("Farhad");
		System.out.println(str.get());
		GenClass<Integer> in = new GenClass<>();
		in.add(10);
		System.out.println(in.get());
	}
	

}
