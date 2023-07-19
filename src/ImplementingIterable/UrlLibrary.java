package ImplementingIterable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {
	
	private LinkedList<String> urls = new LinkedList<>();
	
	//Inner class 
	private class UrlIterator implements Iterator<String>
	{
		int index =0;
		StringBuilder sb = new StringBuilder();
		@Override
		public boolean hasNext() {
			return index < urls.size();
		}

		@Override
		public String next() {
			try {
				URL url = new URL(urls.get(index));
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				String line =null;
				while((line=br.readLine())!=null)
				{
				sb.append(line);
				sb.append("/n");
				}
				
				br.close();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			index++;
			
			return sb.toString();
			
		}
		
	}
	
	public UrlLibrary()
	{
		urls.add("https://www.linkedin.com/in/farhadrashid02");
		urls.add("https://www.github.com/farhadrasheed02");
		urls.add("https://www.facebook.com/farhad.rasheed02");
	}

	
	// One way of calling the iterator method..........
	@Override
	public Iterator<String> iterator() {
		//return urls.iterator();
		return new UrlIterator();
	}
	
	
	
	 

}
