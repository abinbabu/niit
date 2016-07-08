package daytwo;

import java.util.Comparator;

public class MySalaryComp implements Comparator<Emp1> {
	public int compare (Emp1 e1,Emp1 e2)
	{
		if(e1.getSalary()<e2.getSalary())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
