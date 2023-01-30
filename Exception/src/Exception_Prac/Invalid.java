package Exception_Prac;

public class Invalid {
	public class Invalid1 {
		
		public void check(int num) throws InvalidRange
		{
			if(num <0 || num>999999)
			{
			
				throw new InvalidRange();
			}
		}


	}


}
