package employee_management_system.dsc;
import java.util.*;
public class Employee_Management {
	
	LinkedHashSet<Employee>Empset=new LinkedHashSet<Employee>();
	Employee emp1=new Employee(34,"Joshi",24,"Software Engineer-1","4LPA");

	ArrayList<String>dptList=new ArrayList<String>();

	public Employee_Management()
	{
		Empset.add(emp1);
		
		dptList.add("Software Developer-1");
		dptList.add("Software Developer-2");
		dptList.add("Software Engineer");
		dptList.add("Programe Analaylist");
		
	}
	Scanner scan=new Scanner(System.in);
	boolean found=false;
	//Add Employee
	public void  AddEmployee(Employee NewEmployee)
	{
		Empset.add(NewEmployee);
		System.out.println("After Adding New Employee Details List");
		for(Employee E:Empset) {System.out.println(E);}
	}
	//View all employees
	public void ViewAllEmployee()
	{
		for(Employee emp:Empset)
		{System.out.println(emp);}
	}
	//View Employee
	public void ViewEmployee()
	{
		System.out.print("Enter Valid ID:");
		int id=scan.nextInt();
		Iterator<Employee>I=Empset.iterator();
		while(I.hasNext())
		{
			Employee E=I.next();
			if(E.getId()==id)
			{
     		System.out.println(E);
     		found=true;
     		break;
			}
		}
		if(!found)
		{
			System.out.println("Employee not found with this ID");
		}
	}
	
	public String Deparatement_List()
	{
		System.out.println("Enter Valid departement");
		System.out.println("1)software developer-1"
				            +"\n2)software developer-2"
				            +"\n3)software engineer"
				            +"\n4)program analyst");
		Scanner scan=new Scanner(System.in);
		int choice=scan.nextInt();
		return dptList.get(choice-1);
	}
	//Update Employee details
	public void UpdateEmployee()
	{
		System.out.print("Enter ID:");
		int id=scan.nextInt();
		boolean found=false;
		for(Employee emp:Empset)
		{
			if(emp.getId()==id)
			{
				System.out.print("Enter age:");
				emp.setAge(scan.nextInt());
				System.out.print("Enter salary:");
				emp.setSalary(scan.next());
				System.out.println("updated details");
				System.out.println(emp);
				found=true;
				break;
			}
		}
		if(!found)
		{
			System.out.println("Employee not found!!!!!!!!!!!");
		}
		else
		{
			System.out.println("Employee details upadated succesfully!!!!!!!");
		}
	}
	public void Delet_Employee()
	{
		System.out.println("Enter ID:");
		int id=scan.nextInt();
		boolean found=false;
		for(Employee emp:Empset)
		{
			if(emp.getId()==id)
			{
				Empset.remove(emp);
				found=true;
				break;
			}
		}
		if(!found)
		{
			System.out.println("Employee is not found to delet his details !!!!!!!!!!!");
		}
		else
		{
			System.out.println("Employee details deleted succesfully!!!!!!!");
		}
		
	}


}
