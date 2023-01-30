package Exception_Prac;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Scanner;

	public class Finally1 {

		public static void main(String[] args) throws IOException {
			FileInputStream	fis=null;
			/*Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1 st number");
			int num1=sc.nextInt();
			System.out.println("Enter 2nd number");
			int num2=sc.nextInt();
			int res=0;*/
			try
			{
					fis=new FileInputStream("e:/sachin1.txt");
			//res=num1/num2;
			}
			
			finally
			{
				System.out.println("closing file.....");
				fis.close();
			}
			

		}

	}



