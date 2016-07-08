package daytwo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;


public class LinkModel {

	public static void main(String[] args) {
		
		LinkedList<Emp1> list=new LinkedList<Emp1>();
		list.add(new Emp1("tim",3000));
		list.add(new Emp1("rim",6000));
		list.add(new Emp1("sim",5000));
		list.add(new Emp1("kim",4000));
		
	Collections.sort(list, new MySalaryComp());
		System.out.println("sorted list");
		for(Emp1 e:list)
		{
			System.out.println(e.getName());
			System.out.println(e.getSalary());
		}
		

	}

}
