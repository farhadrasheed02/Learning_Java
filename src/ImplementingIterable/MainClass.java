package ImplementingIterable;

public class MainClass {

	public static void main(String[] args) {
		UrlLibrary url_lib = new UrlLibrary();
		
		for(String urls : url_lib)
		{
			System.out.println(urls);
		}

	}

}
