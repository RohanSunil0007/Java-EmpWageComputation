//Welcome to Employee Wage Computation
public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
        final int FullTime=1;
        final int PartTime=2;
        final int ratePerHour= 20 ; 
        int empCheck= (int) Math.floor(Math.random() * 10)%3;
        int salary;
        int EmpHr;
        switch( empCheck ) 
        {
        case FullTime :
        	EmpHr=8;
        	salary= EmpHr * ratePerHour ;
            System.out.println("Full Time Salary is : " + salary);
            break;
        case PartTime :
        	EmpHr=4;
        	salary= EmpHr * ratePerHour ;
            System.out.println("Part Time Salary is : " + salary);
            break;
        default :
        	EmpHr=0;
        	salary= EmpHr * ratePerHour ;
        	System.out.println("Employee is absent , So salary : " + salary);
        }
	}

}
