class Person{
	String name;
	Integer age;
	Person(String name, Integer age){
		this.name=name;
		this.age=age;
	}
}

class Employee extends Person{
	Integer employeeId;
	Integer salary;
	Employee(String name, Integer age, int employeeId, int salary){
		super(name,age);
		this.employeeId= employeeId;
		this.salary= salary;
	}
	void display() {
		System.out.println("Employee Name:"+ name);
		System.out.println("Employee age:"+ age);
		System.out.println("Employee id:"+ employeeId);
		System.out.println("Salary:"+ salary);
	}
}
public class EmployeeMain{
	public static void main(String[] args) {
		Employee obj = new Employee("Sanjay", 22, 1314743, 26000);
		obj.display();
	}
}

