class Account{
	Integer Balance;
	Account(){
		Balance=0;
	}
	
	Account(Integer balance){
		this.Balance= balance;
	}
	
	void display() {
		System.out.println("Account balanace:"+ Balance);
	}
	
	void deposit(int deposit ) {
		Balance+=deposit;
		System.out.println("Deposited Amount:"+ deposit+"\nAccount balance:"+ Balance);
	}
	
	void withdraw(int withdraw) {
			if(withdraw<=Balance) {
				Balance-=withdraw;
				System.out.println("Withdraw Amount:"+ withdraw +"\nAccount balance:"+ Balance);	
			}
			else {
				System.out.println("Withdrawal Error! Insufficient funds!");
			}
		}
	
}

public class AccountMain{
	public static void main(String[] args) {
		Account obj1 = new Account(5000);
		obj1.display();
		obj1.deposit(4000);
		obj1.withdraw(2000);
		
		Account obj2 = new Account();
		obj2.display();
		obj2.deposit(5000);
		obj2.withdraw(7000);
	}
}
	

