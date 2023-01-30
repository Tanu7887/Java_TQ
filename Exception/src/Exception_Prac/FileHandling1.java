package Exception_Prac;


    import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	public class FileHandling1 {

		public static void main(String[] args) throws IOException {
			FileInputStream fis=null;
			
			try {
				 fis=new FileInputStream("e:/sachin.txt");
				System.out.println("file found");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("file not found");
			}
			finally//to perform clean up operation
			{
			fis.close();
			}
			System.out.println("rest of the code");

		}

	}



