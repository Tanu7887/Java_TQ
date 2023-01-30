package abstractionnn;

public interface Calculator {

	
	int operation(int x,int y);
	default void display()
	{
		System.out.println("showing operatopn");
	}
	

}

