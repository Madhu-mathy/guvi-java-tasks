import java.util.*;
interface Taxable{
	int salesTax= 7;
	double incomeTax= 10.5;
	abstract double calcTax();
}
class Employee implements Taxable{
	int empId;
	String name;
	int salary;
	
	Employee(){}
	Employee(int empId,String name,int salary){
		this.empId=empId;
		this.name=name;
		this.salary=salary;
		
	}

	public double calcTax() {
		double yearlySalary= salary*12;
		return (yearlySalary/100)* incomeTax;
	}
}
class Product implements Taxable{
		int pid;
		double price;
		int quantity;
		Product(){}
		Product(int pid,double price,int quantity){
			this.pid=pid;
			this.price=price;
			this.quantity=quantity;
		}
		public double calcTax() {
			 double unitTax= (price/100)*salesTax ;
			 return unitTax;
		}
}


public class DriverMain{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CALCULATE YEARLY TAX");
		System.out.println("Enter Name: ");
		String name= sc.nextLine();
		
		System.out.println("Enter Employee Id: ");
		int empId= sc.nextInt();
		
		System.out.println("Enter Salary: ");
		int salary= sc.nextInt();
		
		Employee employeeObj= new Employee(empId,name,salary);
		double tax= employeeObj.calcTax();
		System.out.println("The Yearly tax amount for "+ name +" with employee id "+ empId+ " is "+tax);
		
		System.out.println("CALCULATE UNIT PRODUCT TAX");
		System.out.println("Enter PID: ");
		int pid= sc.nextInt();
		System.out.println("Enter Price: ");
		int price=sc.nextInt();
		System.out.println("Enter Quantity: ");
		int quantity=sc.nextInt();
		
		Product productObj = new Product(pid,price,quantity);
		System.out.println("The Sales Tax for the product "+ pid +" is "+ productObj.calcTax());
	}
}

