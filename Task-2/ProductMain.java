import java.util.*;

class Product{
	Integer pid;
	Integer price;
	Integer quantity;
	Product(){}
	Product(int pid, int price, int quantity){
		this.pid= pid;
		this.price=price;
		this.quantity=quantity;		
	}
	
	void highestprice(Product[] pro) {
		int highestPid = pro[0].pid;
		int highestprice= pro[0].price;
		
		for(int i =0; i<pro.length; i++) {
			if(highestprice< pro[i].price) {
				highestprice=pro[i].price;
				highestPid= pro[i].pid;
			}
		}
		
		System.out.println("The PID with highest price is " + highestPid);
		}
		
		
		void totalamount(Product[] pro) {
			int total=0;
		for(Product p: pro) {
			total+= p.price* p.quantity;
		}
		System.out.println("Total amount: "+total);
		}
}

public class ProductMain{
	public static void main(String[] args) {
		
		 Product[] pro = new Product[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<5; i++) {
			System.out.println("PID:");
			int pid = sc.nextInt();
			
			System.out.println("Price:");
			int price = sc.nextInt();

			
			System.out.println("Quantity:");
			int quantity = sc.nextInt();

			pro[i] = new Product(pid,price,quantity);
			
		}
		
		
		Product obj= new Product();
		obj.highestprice(pro);
		obj.totalamount(pro);
		
		
		
	}
	
}
