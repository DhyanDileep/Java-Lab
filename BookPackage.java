package book;
public class BookDetails{
	String Name;
	String Author;
	int price;
	
	public BookDetails(String Name, String Author, int price){
		this.Name=Name;
		this.Author=Author;
		this.price=price;
	}
	
	public void display(){
		System.out.println("Name: "+Name);
		System.out.println("Author: "+Author);
		System.out.println("Price: "+price);
	}
}


//import the package
import book.BookDetails;
class BookImport{
	public static void main(String args[]){
		BookDetails obj=new BookDetails("abc","efg",1000);
		obj.display();
	}
}
