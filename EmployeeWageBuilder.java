/* 
  Employee Wage Computation Program.....
*/
class EmployeeWageBuilder {
	static int Is_Full_Time = 1;
	double empCheck=Math.floor(Math.random()*10) % 2 ;
	public void emp_Present(){
		if (empCheck == Is_Full_Time){
			System.out.println("Employee is Present");
		}else{
			System.out.println("Employee is Absent");
		}
	
	}
//main Method 
public static void main(String[] args){
		 EmployeeWageBuilder present_check =  new EmployeeWageBuilder();
		 present_check.emp_Present();	
	}
}