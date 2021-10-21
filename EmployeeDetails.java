import java.util.Scanner;
class Employee 
{
	private int eid;
	private String name=new String();
	private float salary;

	public void inputDetails()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter id: ");
		eid=s.nextInt();

		System.out.println("Enter name: ");
		name=s.next();

		System.out.print("Enter Salary: ");
		salary=s.nextFloat();
	}
	public void showDetails()
	{
		System.out.print("Employee details:\n");
		System.out.println("ID:"+eid+"\nName:"+name+"\nSalary:"+salary);
	}
}
class EmployeeDetails 
{
	public static void main(String[] args) {
		Employee e=new Employee();
		e.inputDetails();
		e.showDetails();
	}
}
