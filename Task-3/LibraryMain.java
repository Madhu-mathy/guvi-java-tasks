import java.util.*;
class Book{
int bookID;
String title;
String author;
boolean isAvailable;
Book(){}
Book(int bookid, String title, String author, boolean isavailable){
	this.bookID= bookid;
	this.title=title;
	this.author=author;
	this.isAvailable= isavailable;	
}

@Override
public String toString() {
	if(isAvailable) {
	return "The book "+ title+" ("+ bookID+") "+ "by author "+author+ " is Available";
}else {
	return "The book "+ title+" ("+ bookID+") "+ "by author "+author+ " is not Available";

	}
}

}

class library{
	ArrayList<Book> bookArray= new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	void addDefaultBooks() {
        bookArray.add(new Book(45, "The Life", "James", true));
        bookArray.add(new Book(12, "Java Basics", "Oracle", true));
        bookArray.add(new Book(30, "Python Guide", "Guido", false));
    }
	
	void addBooks() {
		int numberOfBooks;
		System.out.println("Book Name");
		String title= sc.nextLine();
		System.out.println("Book ID");
		int bookID= sc.nextInt();
		sc.nextLine();
		System.out.println("Author");
		String author=sc.nextLine();
		System.out.println("Is Available(true/false):");
		boolean isAvailable= sc.nextBoolean();
		System.out.println("Number of books Available");
		numberOfBooks= sc.nextInt();
		
		
		Book obj=new Book(bookID, title, author,isAvailable);
		bookArray.add(obj);
	}
	
	void displayBooks(){
		for(Book b: bookArray) {
			System.out.println(b.toString());
			
			
		}
	}
	
	void removeBooks() {
		System.out.println("Enter Book name remove:");
		sc.nextLine();
		String removeInfo= sc.nextLine();
		for (int i = 0; i < bookArray.size(); i++) {
		    Book b = bookArray.get(i);
		    if (removeInfo.equalsIgnoreCase(b.title)) {
		        bookArray.remove(i); 
		        System.out.println("Book removed successfully.");
		        break;                
		        }    
		}
		
		}
	void searchBookById() {

	    System.out.print("Enter Book ID to search: ");
	    int searchId = sc.nextInt();
	    sc.nextLine();
	    boolean found = false;
	    for (Book b : bookArray) {
	        if (b.bookID == searchId) {
	            System.out.println("Book found:");
	            System.out.println(b);
	            found = true;
	            break;
	        }
	    }

	    if (!found) {
	        System.out.println("Book not found.");
	    }
	}

}

public class LibraryMain{
	public static void main(String[] args) {
		
		library lib= new library();
		lib.addDefaultBooks();
		lib.addBooks();
		lib.displayBooks();
		lib.removeBooks();
		lib.displayBooks();
		lib.searchBookById();
		}
}
