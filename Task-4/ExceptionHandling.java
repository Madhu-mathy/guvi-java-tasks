class Student{
	int rollNo;
	String name;
	int age;
	String course;
	
	Student(int rollNo, String name, int age, String course){
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
		this.course=course;
	}
}

public class ExceptionHandling{
	public static void main(String[] args) {
		Student obj1= new Student(45,"Rahul",15, "Java");
		
		try {
			if(!(obj1.age>15&& obj1.age<21)){
				throw new Exception("AgeNotWithinRangeException");
			}
		}
		catch(Exception e){
			System.out.println(e.getLocalizedMessage());
		}
			
		try {
			if(!((obj1.name).matches("[a-zA-Z]+"))) {
				throw new Exception("NameNotValidException");
			}
		}	
		catch(Exception e){
			System.out.println(e.getLocalizedMessage());
		}
	}
	
}
