package Project_Library;

import java.util.Scanner;

public class LibraryPro {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Enter Branch name : ");
		String branchName = sc.next();

		if (branchName.equals("Computer")) {//to go inside branch shell 1st
			
			System.out.println("Enter Computer Book Name : ");
			String Computer = sc.next();
			
			switch (Computer) {

			case "DBMS": {
				int total_qty = 15;
				System.out.println("Enter book qty of DOM : ");
				int qty = sc.nextInt();
				if (qty <= total_qty) {
					int balance = total_qty - qty;
					System.out.println("Available book balance is : " + balance);
					total_qty = balance;
				} else
					System.out.println("Book out of stock");
				break;
			}
			case "JAVA": {
				int total_qty = 25;
				System.out.println("Enter quantity to issue of JAVA Books : ");
				int qty = sc.nextInt();
				if (qty <= total_qty) {
					int balance = total_qty - qty;
					System.out.println("Available qty is : " + balance);
					total_qty = balance;//updated new balance of book in library
				} else
					System.out.println("Book Out of stock");
				break;
			}
			case "CPP": {
				int total_qty = 20;
				System.out.println("Enter quantity to issue of CPP Books : ");
				int qty = sc.nextInt();
				if (qty <= total_qty) {
					int balance = total_qty - qty;
					System.out.println("Available qty is : " + balance);
					total_qty = balance;
				} else
					System.out.println("Book out of stock");
				break;
			}
			case "AI": {
				int total_qty = 15;
				System.out.println("Enter quantity to issue of AI Books : ");
				int qty = sc.nextInt();
				if (qty <= total_qty) {//if qty of book is more than required else will get print
					int balance = total_qty - qty;
					System.out.println("Available qty is : " + balance);
					total_qty = balance;
				} else
					System.out.println("Book out of stock");
				break;
			}
			}
			
			
			
		} else if (branchName.equals("Civil" )) //second branch
			
			System.out.println("Enter Civil Book Name : ");
			String Civil = sc.next();
			
			switch (Civil) {

			case "CDOM": {
				int total_qty = 15;
				System.out.println("Enter book qty of CDOM : ");
				int qty = sc.nextInt();
				if (qty <= total_qty) {
					int balance = total_qty - qty;//input - available to get new availaible stock 
					System.out.println("Available book balance is : " + balance);
					total_qty = balance;
				} else
					System.out.println("Book out of stock");
				break;
			}        
			case "CTOM": {//this all r book names 
				int total_qty = 25;
				System.out.println("Enter quantity to issue of CTOM Books : ");
				int qty = sc.nextInt();
				if (qty <= total_qty) {
					int balance = total_qty - qty;
					System.out.println("Available qty is : " + balance);
					total_qty = balance;
				} else
					System.out.println("Book Out of stock");
				break;
			}
			case "CMOS": {
				int total_qty = 20;
				System.out.println("Enter quantity to issue of CMOS Books : ");
				int qty = sc.nextInt();
				if (qty <= total_qty) {
					int balance = total_qty - qty;
					System.out.println("Available qty is : " + balance);
					total_qty = balance;
				} else
					System.out.println("Book out of stock");
				break;
			}
			case "CHT": {
				int total_qty = 15;
				System.out.println("Enter quantity to issue of CHT Books : ");
				int qty = sc.nextInt();
				if (qty <= total_qty) {
					int balance = total_qty - qty;
					System.out.println("Available qty is : " + balance);
					total_qty = balance;
				} else
					System.out.println("Book out of stock");
				break;
			}
			}
		}
}
