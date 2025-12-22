class Person{
	 String name;
	 Integer age;
	 Person(){
		 age =18; // default age of person 
	 }
	 Person(String name, Integer age){
		 this.name=name;
		 this.age=age;
	 }
	 void display() {
		 System.out.println("Name:"+ this.name);
		 System.out.println("Age:"+ this.age);
	 }
 }
 
 public class PersonClass{
	 public static void main(String[] args) {
		 
		 Person obj = new Person("madhu", 20);
		 obj.display();
		 
		 Person obj2 = new Person();
		 obj2.name= "Sanjay";
		 obj2.display();
		 
		 Person obj3 = new Person();
		 obj3.name="Ashok";
		 obj3.age=23;
		 obj3.display();
	 }
 }
