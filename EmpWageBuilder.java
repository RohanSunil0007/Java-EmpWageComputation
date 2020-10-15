//Welcome to Employee Wage Computation

import java.util.ArrayList;

//Interface
interface InterfaceEmployeeWageComputation {
	public void addCompanyEmpWage(String company,int ratePerHours,int MaxworkingDays,int MaxHrsPerMonth );
	public void employeeWageComputation();
	
}
public class EmpWageBuilder implements InterfaceEmployeeWageComputation {

	//Constants
			public static final int FULL_TIME = 1;
			public static final int PART_TIME = 2;
			
			 int numOfCompany = 0;
			//ArrayList
		     ArrayList<CompanyEmpWage> companyEmpWageList;
			
			public EmpWageBuilder() {
				companyEmpWageList = new ArrayList<>();
			}
			
			public void addCompanyEmpWage(String company,int ratePerHours,int MaxworkingDays,int MaxHrsPerMonth ) {
				CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, ratePerHours, MaxworkingDays, MaxHrsPerMonth );
				companyEmpWageList.add(companyEmpWage);
			}
			
			 public void employeeWageComputation() {
				for (int i=0; i< companyEmpWageList.size() ; i++) {
					CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
					companyEmpWage.totalSalary(employeeWageComputation(companyEmpWage) );
					System.out.println(companyEmpWage);
				}
			}
			
			
			 public int employeeWageComputation(CompanyEmpWage companyEmpWage) {
					//Variables
				    int salary=0;
		            int EmpHours=0;
		            int totalEmpHours=0;
		            int totalEmpDays=0;
					
					//computation
					while(totalEmpDays < companyEmpWage.MaxworkingDays && totalEmpHours < companyEmpWage.MaxHrsPerMonth) {
						totalEmpDays++;
						
						int employeeCheck = (int) (Math.floor(Math.random()*10)%3);
						
						//Attendance check
						switch(employeeCheck) {
						case FULL_TIME:
							EmpHours = 8;
							break;
						case PART_TIME:
							EmpHours = 4;
							break;
						default:
							EmpHours = 0;
							break;
						}
				
					//daily wage calculations
				    salary = EmpHours * companyEmpWage.ratePerHours;
					totalEmpHours += EmpHours;
					
					System.out.println("Day " +totalEmpDays+ " employee work hours " +EmpHours+ " and daily wage is " +salary);
					
					}
					return totalEmpHours * companyEmpWage.ratePerHours;
			}
			
			
			public static void main (String args[]) {
				System.out.println("Welcome to employee wage computation problem");
				
				InterfaceEmployeeWageComputation empWageBuilder = new EmpWageBuilder();
				empWageBuilder.addCompanyEmpWage("Amazon", 20, 20, 100);
				empWageBuilder.addCompanyEmpWage("Google", 10, 20, 100);
				
				empWageBuilder.employeeWageComputation();
			
			}	
}
