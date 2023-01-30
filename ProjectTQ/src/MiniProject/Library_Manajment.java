package MiniProject;

public class Library_Manajment {

	String book_name;
	int price;
	private int withdrawl_quntity;
	int totalBookstock = 15210;

	// this is for "withdrawl_quntity";;;
	public void setwithdrawl_quntity(int withdrawl_quntity) {
		this.withdrawl_quntity = totalBookstock - withdrawl_quntity;
	}

	int getwithdrawl_quntity() {
		return withdrawl_quntity;
	}

	// Now for price And Book Name;;;
	Library_Manajment(String book_name, int price) {
		this.book_name = book_name;
		this.price = price;
	}
	
	public String toString() {
		return "Book name is : " + book_name + "\n" + "Price of book is : " + price;
	}
	
}



