package daytwo;

import java.util.ArrayList;
import java.util.Iterator;




public class Array {

	public static void main(String[] args) {
		
	ArrayList<String> al=new ArrayList<>();
		al.add("java");
		al.add("c");
		al.add("php");
		System.out.println(al);
		System.out.println("does contain"+al.contains("java"));
		al.add(2,"cobol");
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		
		Iterator <String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
