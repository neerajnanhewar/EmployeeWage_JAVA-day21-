/* 
  Employee Wage Computation Program.....
*/
class EmployeeWageBuilder {
	static final int Is_Full_Time = 1;
	static final int Is_Part_Time = 2;
	static final int Emp_Rate_PerHr = 20 ;
	static final int Total_Work_Day = 20;
	int emp_FullDay_Hr = 0 ;
	int emp_Wage = 0 ;
	int total_EmpWage=0;		
	public void emp_Wage_Cal(){
		for(int day=1;day<=Total_Work_Day;day++){
			int empCheck= (int) Math.floor(Math.random()*10) % 3 ;		
			switch (empCheck){
				case Is_Full_Time :
					emp_FullDay_Hr = 8;
				break ;
		    	case Is_Part_Time :
					emp_FullDay_Hr = 4 ;
				break ;
				default:
					emp_FullDay_Hr = 0;
				break ;
			}
			emp_Wage = Emp_Rate_PerHr * emp_FullDay_Hr ;		
			total_EmpWage += emp_Wage ;
				System.out.println("Employee's [day-" + day + "] wage is " + emp_Wage);
		}	
		System.out.println("Employee Total wage For a Month : " + total_EmpWage);
	}
//main Method 
	public static void main(String[] args){
		 EmployeeWageBuilder present_check =  new EmployeeWageBuilder();
		 present_check.emp_Wage_Cal();	
	}
}