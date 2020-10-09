//Welcome to Employee Wage Computation
public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
        final int isPresent=1;
        final int ratePerHour= 20 ; 
        double empCheck= Math.floor(Math.random() * 10)%2;
        int salary;
        int EmpHr;
        if ( empCheck == isPresent)
        {
        	EmpHr=8;
        	salary= EmpHr * ratePerHour ;
            System.out.println("Employee is Present , so Salary is : " + salary);
        }
        else
        { 
        	System.out.println("Employee is absent , So no salary ");
        }
	}

}
