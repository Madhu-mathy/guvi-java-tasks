class voter{
	int voterId;
	String name;
	int age;
	
	voter(int voterId, String name, int age) throws Exception{
		
		if(age<18) {
			throw new Exception("Invalid age for voter");
		}
		
		this.voterId=voterId;
		this.name=name;
		this.age=age;
	}
}

public class VoterException{
	public static void main(String[] args) {
		try {
			voter v = new voter(4578204, "Rithya", 14);
		}
		catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
