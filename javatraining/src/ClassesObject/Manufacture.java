package ClassesObject;

 class Manufacture 
{
	String name="samsung";


public class ItemMain{

                public  void main(String[] args) {
				Item item1=new Item();
				Customer c=new Customer();
				Manufacture m=new Manufacture();
				item1.i_name="washingMachine";
				item1.quantity=2;
				item1.price=20000;
				c.print();
				item1.print();
				System.out.println("manufacture is.."+m.name);
				
				

			}

	}
}


	
		
