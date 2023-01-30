package MiniProject;
import java.util.Scanner;



	public class Library_Main {

		public static void main(String[] args) {

			Library_Manajment lb = new Library_Manajment("Strength of material", 1500);

			System.out.println(lb.toString());

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter total qty : ");
			int sum = sc.nextInt();
			
			lb.setwithdrawl_quntity(sum);
			System.out.println("Available Qty of Book is : " + lb.getwithdrawl_quntity());

			System.out.println("Enter Book Name : ");
			String Mechanical = sc.next();
			
			switch(Mechanical) {
			case "DOM":{
				int total_qty=15;
				System.out.println("Enter book qty of DOM : ");
				int qty=sc.nextInt();
				int balance=total_qty-qty;
				System.out.println("Available book balance is : "+balance);
				total_qty=balance;
				break;
			}
			case "TOM" :{
				int total_qty=25;
				System.out.println("Enter quantity to issue of TOM Books : ");
				int qty=sc.nextInt();
				int balance= total_qty-qty;
				System.out.println("Available qty is : "+balance);
				total_qty=balance;
				break;
			}
			case "MOS" :{
				int total_qty=20;
				System.out.println("Enter quantity to issue of Mos Books : ");
				int qty=sc.nextInt();
				int balance= total_qty-qty;
				System.out.println("Available qty is : "+balance);
				total_qty=balance;
				break;
			}
			}
		}

	}



