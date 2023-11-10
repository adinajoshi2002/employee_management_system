package employee_management_system.dsc;

public class Employee {

		private int eid;
		private String ename;
		private int age;
		private String departement;
		private String salary;
		 public Employee() {}
		public Employee(int eid,String ename,int age,String departement,String salary)
		{
			this.eid=eid;
			this.ename=ename;
			this.age=age;
			this.departement=departement;
			this.salary=salary;
		}

		public void setId(int id)
		{
			this.eid=id;
		}
		public int getId()
		{
			return eid;
		}
		public void setName(String Name)
		{
			this.ename=Name;
		}
		public String getName()
		{
			return ename;
		}
		public void setAge(int age)
		{
			this.age=age;
		}
		public int getAge()
		{
			return age;
		}
	    public void setDepartement(String departement)
	    {
	    	this.departement=departement;
	    }

	    public String getDepartement()
	    {
	    	return departement;
	    }
	    public void setSalary(String salary)
	    {
	    	this.salary=salary;
	    }
	    public String getSalary()
	    {
	    	return salary;
	    }
	    public String toString()
	    {
	    	return "Employee [EmployeeId="+eid+","+"EmployeeName="+ename+","+"EmployeeAge="+age+","+"EmployeeDeparatement="+departement+","+"EmployeeSalary="+salary+"]";
	    }
	}

	


