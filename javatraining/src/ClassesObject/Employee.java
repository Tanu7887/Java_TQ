package ClassesObject;

public class Employee {

	

		int e_id;
		String name="Sonali";
		String designation="Java Developer";
		float salary=50000;
		String department="I.T";
				
		String gender="female";
		
		
		void print()
		{
			System.out.println("id is"+e_id);
			System.out.println("name is"+name);
			System.out.println("designation is"+designation);
			System.out.println("salary is"+salary);
			System.out.println("department is"+department);
			System.out.println("gender is.."+gender);
			
		}
		
		void calculate_Salary()//created method
		{
			if(salary>1000)
			{
				salary=salary+2000;
			}
		}

		public static void main(String[] args) {
			Employee emp1=new Employee();
		System.out.println(emp1);
			//e.print();
		    emp1.e_id=10001;
		    emp1.salary=18000;
			System.out.println("------");
			emp1.print();
			emp1.calculate_Salary();
			emp1.print();

		}

	
	}


