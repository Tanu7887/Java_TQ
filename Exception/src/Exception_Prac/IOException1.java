package Exception_Prac;

import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



	public class IOException1 {

		public static void main(String[] args) throws IOException {
			InputStreamReader fis=new InputStreamReader(System.in);
		    BufferedReader bs=new BufferedReader(fis);
		 
		    
		   String s= bs.readLine();
		   System.out.println(s);
		   
		 
		   
		   System.out.println("Enter string");
		   String ss=bs.readLine();
		   
		   System.out.println("Enter string");
		   String ss2=bs.readLine();
		   
		   char x=(char) bs.read();
		   System.out.println(x);
		   
		   
		   int age=Integer.parseInt(ss);
		   System.out.println(age);
		   
		   float f=Float.parseFloat(ss2);
		   System.out.println(ss2);
		   
		   
		   

		}

	}



