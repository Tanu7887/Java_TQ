package abstractionnn;

interface printable
{
	void print();
	
}
interface showable
{
	void print();
	
}


class Emp implements printable,showable
{

	public void print() {
		System.out.println("Showing Employee Details");
		
	}
	

}



public class Abstraction2 {

	public static void main(String[] args) {
		showable s=new Emp();
		s.print();
		printable p=new Emp();
		p.print();



	}

}
