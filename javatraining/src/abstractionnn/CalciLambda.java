package abstractionnn;

public class CalciLambda {
	public static void main(String[] args) {

	calculator c=new Addition();
	System.out.println(c.operation(10, 20));
	
	
	calculator c=(a,b)->{return a+b;};
	c.display();
	System.out.println(c.operation(23, 34));
	calculator c1=(a,b)->{return a-b;};
	
		System.out.println(c1.operation(23, 34));
		
		
	sin s=()->{System.out.println(Math.sin(2.3));};s.show();
	
	
	
	

}

}

			
	
