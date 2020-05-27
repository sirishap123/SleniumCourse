package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo 

{

	public static void main(String[] args)
	
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++)
		{
			a.add(i);
		}
		
		System.out.println(a);
		
		Iterator<Integer> var = a.iterator();
		
		while(var.hasNext())
		{
			Integer I = var.next();
			
			if(I%2==0)
				System.out.println(I);
			
			else
				
				var.remove();
		}
		
		System.out.println(a);

	}

}
