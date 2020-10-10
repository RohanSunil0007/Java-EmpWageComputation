//Welcome to Employee Wage Computation
public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
        final int FullTime=1;
        final int PartTime=2;
        final int ratePerHour= 20 ; 
        int salary;
        int TotalSalary=0;
        int EmpHr;
        int workingDayPerMonth=20;
        int day=1;
        while (day <= workingDayPerMonth )
        {
        	int empCheck= (int) Math.floor(Math.random() * 10)%3;
        	switch( empCheck ) 
        	{
        	case FullTime :
        		EmpHr=8;
        		break;
        	case PartTime :
        		EmpHr=4;
        		break;
        	default :
        		EmpHr=0;
        	}
        	salary= EmpHr * ratePerHour ;
        	TotalSalary+=salary;
        	day++;
      }
     System.out.println("Total Salary for a month is : " + TotalSalary );
  }
}
