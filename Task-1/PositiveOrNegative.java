import java.util.*;
public class PositiveOrNegative {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value: ");
    Integer num= sc.nextInt();
    if(num==0) {
    	System.out.println("Zero is neither positive nor negative");
    }
    else if(num>0) {
    	System.out.println("Positive");
    }
    else {
    	System.out.println("Negative");
    }
    }
}  
