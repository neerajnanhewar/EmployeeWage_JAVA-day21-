/* 
  Employee Wage Computation Program.....
*/
class EmployeeWageBuilder {
	static final int Is_Full_Time = 1;
	static final int Is_Part_Time = 2;
	static final int Emp_Rate_PerHr = 20 ;
	static final int Total_Work_Day = 20;
	static final int Total_Working_Hr_Month = 100;
	int emp_FullDay_Hr = 0 ;
	int emp_Wage = 0 ;
	int total_EmpWage=0;		
	int total_working_day=0;
	int total_empHrs = 0;
	public void emp_Wage_Cal(){
		while(total_working_day < Total_Work_Day && total_empHrs < Total_Working_Hr_Month ){
			total_working_day++;
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
			total_empHrs += emp_FullDay_Hr;
			System.out.println("Employee's [day-" + total_working_day + "] wage is " + emp_Wage);
		}	
		System.out.println("Totla Working hours " + total_empHrs );
		System.out.println("Employee Total wage For a Month : " + total_EmpWage);
	}
//main Method 
	public static void main(String[] args){
		 EmployeeWageBuilder present_check =  new EmployeeWageBuilder();
		 present_check.emp_Wage_Cal();	
	}
}