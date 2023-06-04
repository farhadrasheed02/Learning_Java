package InterfacesImplement;

public class ParentClass {

	public static void main(String[] args) {

		// Operations on Employee class;
		 Employee emp = new Employee();
		 emp.EmployeeInfo("Farhad");
		 // how I am working on Interface her
		 
		// ShowInfo info = new ShowInfo(); if try to create object  shows error because we can not  instantiate the interface ;
		//  ShowInfo info = new Employee();	// as the employee class implement the interface so we can simple, call this way
		  ShowInfo info = emp;   // new Employee() is stored in emp so same 
		 info.ShowingInfo("Farhad", 261664);
		 
		 
		 //Operations done on the Company Class
		 Company cmp = new Company();
		 cmp.comname("Vodafone");
		 ShowInfo infocomp = cmp;
		 infocomp.ShowingInfo("_VIOS", 1857);
		
		 //Method defined and executed here....
		 OutsideInfo(cmp);  // static so no need to create the object here...

		 // method created in Employee class and called her
		Employee.interfworking(infocomp); // to understand this call, since interfworking
	
	}
	public static void OutsideInfo(ShowInfo inform)
	{
		inform.ShowingInfo("WorkDay", 1900);
		//System.out.println("Outside infromation is :" +inform);
	}

}
