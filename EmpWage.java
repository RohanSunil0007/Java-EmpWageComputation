//Welcome to Employee Wage Computation
public class EmpWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
        final int FullTime=1;
        final int PartTime=2;
        final int ratePerHour= 20 ; 
        double empCheck= Math.floor(Math.random() * 10)%3;
        int salary;
        int EmpHr;
        	if ( empCheck == FullTime )
        	{
        		EmpHr=8;
        		salary= EmpHr * ratePerHour ;
            System.out.println("Full Time Salary is : " + salary);
        	}
         else if (empCheck == PartTime )
         {
        		EmpHr=4;
        		salary= EmpHr * ratePerHour ;
            System.out.println("Part Time Salary is : " + salary);
         }
         else
         {
        		EmpHr=0;
        		salary= EmpHr * ratePerHour ;
        		System.out.println("Employee is absent , So salary : " + salary);
         }
	}

}
