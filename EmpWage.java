//Welcome to Employee Wage Computation
public class EmpWage {

//CONSTANTS
public static final int FullTime=1;
public static final int PartTime=2;
public static final int ratePerHours= 20 ;
public static final int MaxworkingDays=20;
public static final int MaxHrsPerMonth=100;


     public static int EmployeeWageComputation() {
      //VARIABLES
       int salary=0;
       int EmpHours=0;
       int totalEmpHours=0;
       int totalEmpDays=0;

        while (totalEmpHours < MaxHrsPerMonth && totalEmpDays < MaxworkingDays  )
        {
        	totalEmpDays++;
        	int empCheck= (int) Math.floor(Math.random() * 10)%3;

        	//Attendance Check
        	switch( empCheck )
        	{
        	case FullTime :
        		EmpHours=8;
        		break;
        	case PartTime :
        		EmpHours=4;
        		break;
        	default :
        		EmpHours=0;
        		break;
        	}
        	//daily wage calculations
        	salary= EmpHours * ratePerHours ;
        	totalEmpHours += EmpHours;
        	System.out.println("Day " +totalEmpDays + " Employee work hours " +EmpHours +" and daily wage is " +salary ); 
      	}
     		System.out.println("Total Salary for a month is : " +totalEmpHours * ratePerHours );
     		return totalEmpHours * ratePerHours;
     }
     public static void main(String[] args) {
    	System.out.println("Welcome to Employee Wage Computation");
    	EmployeeWageComputation();
      }
}
