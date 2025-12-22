import java.util.*;
class Methods{
	Map<String,Integer> studentList= new HashMap<>();
	Scanner sc = new Scanner(System.in);
	public void addStudents() {
		System.out.println("How many students to be added:");
		int num=sc.nextInt();
		sc.nextLine();
		for(int i=1; i<=num;i++) {
			System.out.println("Enter Student"+i+" Name:");
			String name= sc.nextLine();
			System.out.println("Enter Student"+i+" Grade:");
			int grade = sc.nextInt();
			sc.nextLine();
			studentList.put(name, grade);
		}
	}
	
	
	public void removeStudents() {
		System.out.println("How many students to be removed:");
		int num=sc.nextInt();
		sc.nextLine();
		for(int i=1; i<=num;i++) {
			System.out.println("Enter student"+i+" name to be removed:");
			String removeName=sc.nextLine();
			studentList.remove(removeName);
		}
	}
	
	public void viewGrade() {
		System.out.println("Enter Student name to view grade:");
		String nameForGrade= sc.nextLine();
		System.out.println(studentList.get(nameForGrade));
	}
}

public class HashMapExercise{
	public static void main(String[] args) {
		Methods m = new Methods();
		System.out.println(m.studentList);
		m.addStudents();
		System.out.println(m.studentList);
		m.removeStudents();
		System.out.println(m.studentList);
		m.viewGrade();
		
	}	
}
