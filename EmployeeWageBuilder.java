/* 
  Employee Wage Computation Program.....
*/
class EmployeeWageBuilder {
	static final int Is_Full_Time = 1;
	static final int Is_Part_Time = 2;
	static final int Emp_Rate_PerHr = 20 ;
	int emp_FullDay_Hr = 0 ;
	int emp_Wage = 0 ;
	int empCheck= (int) Math.floor(Math.random()*10) % 3 ;
	
	public void emp_Wage_Cal(){
		switch (empCheck){
			case Is_Full_Time :
				System.out.println("Employee is Full Time Working ");
				emp_FullDay_Hr = 12;
			break ;
		    case Is_Part_Time :
				System.out.println("Employee is Part Time Working ");
				emp_FullDay_Hr = 8 ;
			break ;
			default:
			System.out.println("Employee is Absent ");
			break ;
		}
		emp_Wage = Emp_Rate_PerHr * emp_FullDay_Hr ;		
		System.out.println("Employee Total wage is " + emp_Wage);
	}
//main Method 
public static void main(String[] args){
		 EmployeeWageBuilder present_check =  new EmployeeWageBuilder();
		 present_check.emp_Wage_Cal();	
	}
}