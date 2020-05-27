package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo

{

	public static void main(String[] args) 
	
	{
		LinkedList<String> l = new LinkedList<String>();
		
		l.add("oracle");
		l.add("okatech");
		l.add("carrier");
		l.add("bi-labs");
		
		System.out.println(l);
		
		ListIterator<String> v = l.listIterator();
		
		while(v.hasNext())
		{
			String val = v.next();
		
			if(val.equals("oracle"))
				
				v.set("Colabra Consultansing");
			
			else
				v.remove();				
		}
		
		System.out.println(l);
	}

}
