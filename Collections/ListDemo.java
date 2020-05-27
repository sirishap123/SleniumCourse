package Collections;

import java.util.ArrayList;

public class ListDemo 

{

	public static void main(String[] args) 
	
	{
		ArrayList<Object> a = new ArrayList<Object>();
		
		a.add(10);
		a.add("sirisha");
		a.add(12.3f);
		a.add(10);
		a.add(20);
		a.add(30);
		
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a.contains("sirisha"));
		System.out.println(a.hashCode());
		
		a.add("40");
		System.out.println(a);
		
		a.add(1,"Siri");
		System.out.println(a);
		
		a.set(1, "Ponnekanti");
		System.out.println(a);
		
		
		System.out.println(a.subList(1, 4));
		
		a.remove(1);
		System.out.println(a);
		
		a.remove("ponnekanti");
		System.out.println(a);
		a.clear();
		System.out.println(a);

	}

}
