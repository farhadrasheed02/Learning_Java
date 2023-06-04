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
	}

}
