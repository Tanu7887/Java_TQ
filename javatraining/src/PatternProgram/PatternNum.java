package PatternProgram;

public class PatternNum {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) 
			{
			for(int sp=1;sp>=i;sp--)
			{
				System.out.print("");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);

		}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println("");

	}

}
}
