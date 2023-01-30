package Exception_Prac;

public class Null {
	public static void main(String[] args) {
		String s=null;
		try
		{
		System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("ur dealing with string which has null value");
		}
		}

	}



