package Encapsulation;

public class TextBook {

	public static void main(String[] args) {


			Book b=new Book();
			
			b.setB_authname("Einstein");
			b.setB_name("Java");
			b.setB_price(500);
			
			System.out.println(b.getB_authname());
			System.out.println(b.getB_name());
			System.out.println(b.getB_price());
		}

	}
	
