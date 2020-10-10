//Welcome to Employee Wage Computation
public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		//CONSTANTS
        final int FullTime=1;
        final int PartTime=2;
        final int ratePerHour= 20 ; 
        int workingDayPerMonth=20;
        int MaxHrsPerMonth=100;
        //VARIABLES
        int salary;
        int EmpHr;
        int day=1;
        int totalEmpHrs=0;
        int totalEmpDays=0;
        while (totalEmpHrs < MaxHrsPerMonth && totalEmpDays < workingDayPerMonth  )
        {
        	totalEmpDays++;
        	int empCheck= (int) Math.floor(Math.random() * 10)%3;
        	//Attendance Check
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
        	//daily wage calculations
        	salary= EmpHr * ratePerHour ;
        	totalEmpHrs += EmpHr;
        	System.out.println("Day " +totalEmpDays + " Employee work hours " +EmpHr +" and daily wage is " +salary ); 
        	day++;
      }
     System.out.println("Total Salary for a month is : " +totalEmpHrs * ratePerHour );
  }
}
