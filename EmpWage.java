//Welcome to Employee Wage Computation
public class EmpWage {

   //CONSTANTS
   public static final int FullTime=1;
   public static final int PartTime=2;

   public final String company;
   public final int ratePerHours;
   public final int MaxworkingDays;
   public final int MaxHrsPerMonth;
   int totalSalary;

   //CONSTRUCTOR
   public EmpWage(String company , int ratePerHours , int MaxworkingDays , int MaxHrsPerMonth) {
	   this.company=company;
	   this.ratePerHours = ratePerHours;
	   this.MaxworkingDays = MaxworkingDays;
	   this.MaxHrsPerMonth = MaxHrsPerMonth;
   }
   //Method
    void EmployeeWageComputation() {
        System.out.println(company + " Wage Computation ");
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
        int totalSalary= totalEmpHours * ratePerHours; 
     System.out.println("Total Salary for a month is : " +totalSalary );
    }

    public static void main(String[] args) {
    	System.out.println("Welcome to Employee Wage Computation !");
    	System.out.println(" ");
    	EmpWage company1=new EmpWage("Amazon", 20, 20, 100);
    	company1.EmployeeWageComputation();

    	System.out.println(" ");

    	EmpWage company2=new EmpWage("Walmart", 20,30, 100);
    	company2.EmployeeWageComputation();
    }
}
