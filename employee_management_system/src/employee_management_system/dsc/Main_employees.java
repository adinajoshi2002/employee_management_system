package employee_management_system.dsc;
import java.util.*;
public class Main_employees {
	
	public static void menu()
	{
	System.out.println("************** WELCOME TO EMPLOYE MANAGEMENT SYSTEM*********************"
	           +"\n 1.Add Employee"
	           +"\n 2.View Employee"
	           +"\n 3.Update Employee"
	           +"\n 4.Delete Employee"
	           +"\n 5.View All Employee"
	           +"\n  6.Exist");
	}

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Employee_Management Service=new Employee_Management();
		Employee E=new Employee();
		do
		{
			menu();
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Add Employee");
				System.out.println("Enter ID:");
				int AddId=scan.nextInt();
				System.out.println("Enter Name:");
				String AddName=scan.next();
				System.out.println("Enter age:");
				int AddAge=scan.nextInt();
				System.out.println("Enter departement:");
				String AddDepartement= Service.Deparatement_List();
				System.out.println("Enter salary:");
				String AddSalary=scan.next();
				Employee NewEmployee=new Employee(AddId,AddName,AddAge,AddDepartement,AddSalary);
				Service.AddEmployee( NewEmployee);
				
				break;
			case 2:
				System.out.println("View Employee");
				Service.ViewEmployee();
				break;
			case 3:
				System.out.println("Update Employee");
				Service.UpdateEmployee();
				break;
			case 4:
				System.out.println("Delete Employee");
				 Service.Delet_Employee();
				break;
			case 5:
				System.out.println("View All Employee");
				Service.ViewAllEmployee();
				break;
			case 6:
				System.out.println("Thanks for using this application");
				System.exit(0);
	         default :
	        	 System.out.println("please enter a valid choice");
			}
		}while(true);
			
		
		

	}

}
