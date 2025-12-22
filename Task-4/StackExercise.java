import java.util.*;
class Methods{
	Stack<Integer> numStack = new Stack<>();
	Scanner sc = new Scanner(System.in);
	public void addElements() {
		
		System.out.println("Number of elements to add to the Stack");
		int num = sc.nextInt();
		sc.nextLine();
		for(int i=1; i<=num; i++) {
		System.out.println("Integer"+i+" to add to Stack:");
		int input=sc.nextInt();
		sc.nextLine();
		numStack.push(input);	
	}
}
	public void popElement() {
		System.out.println("Number of elements to pop from the Stack");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
		numStack.pop();
		}
	}
	
	public void checkIfEmpty() {
		if(numStack.isEmpty()) {
			System.out.println("The Stack is Empty");		
		}
		else {
			System.out.println("The Stack have Elements");
			System.out.println("Number of elements in stack is "+numStack.size() );
		}
	}
}


public class StackExercise{
	public static void main(String[] args) {
		Methods m = new Methods();
		m.addElements();
		System.out.println(m.numStack);
		m.popElement();
		System.out.println(m.numStack);
		m.checkIfEmpty();
		
	}
}
