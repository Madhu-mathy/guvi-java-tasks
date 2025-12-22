import java.util.*;

public class IndexException{
	public static void main(String[] args) {
		String[] weekdays= {"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday","Sunday"};
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Give a number[0-7]:");
			int a=sc.nextInt();
			System.out.println(weekdays[a]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Input Not Within Range");
		}
		catch(InputMismatchException e) {
			System.out.println("Input Invalid");
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		
	}
} 
