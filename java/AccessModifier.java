class Employee {
	public String name;
	protected int employeeId;
	private double salary;
	
	public Employee(String name, int employeeId, double salary) {
		this.name=name;  this.employeeId=employeeId;  this.salary=salary;
	}
	public void displayDetails() {
		System.out.println("Name:"+name);
		System.out.println("Employee ID:"+employeeId);
		System.out.println("Salary:$"+salary);
	}
	protected void calculateBonus() {
		double bonus=salary*0.1;
		System.out.println("Bonus:$"+bonus);
	}
}
class Manager extends Employee{
	private String department;
	
	public Manager(String name, int employeeId, double salary, String department) {
		super(name,employeeId,salary);
	   this.department=department;
	}
	public void displayDetasails() {
		super.displayDetails();
		System.out.println("Department:"+department);
	}
}
class Staff extends Employee{
	private int workingHours;
	public Staff(String name,int employeeId,double salary,int workingHours) {
		super(name,employeeId,salary);
		this.workingHours=workingHours;
	}
	public void displayDetails() {
     super.displayDetails();
     System.out.println("Working Hours:"+workingHours);
     
	}
}
public class AccessModifier {

	public static void main(String[] args) {
	  Manager manager=new Manager("Mr.X",101,50000.0,"Sales");
	  Staff staff=new Staff("Mr.Y",202,60000.0,50);
	  System.out.println("Manager Details:");
	  manager.displayDetails();
	  manager.calculateBonus();
	  
	  System.out.println();
	  System.out.println("Staff Details:");
	  staff.displayDetails();
	  staff.calculateBonus();
	  

	}

}
