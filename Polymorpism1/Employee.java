package Polymorpism1;

public class Employee {

	

		
		String name;
		String jobTittle;
		int salary;
		
		
		public void Employee1(String name,String jobTittle, int saraly) {
			System.out.println( name+" "+jobTittle+" "+saraly);
		}
		
		public void Employee1(String name,int saraly,String jobTittle) {
			System.out.println( name+" "+saraly+" "+jobTittle);
		}
	}


class main{
	public static void main(String[] args) {
		
	
	Employee e = new Employee();
	e.Employee1("keerthi", 100000, "lead");
	e.Employee1("sampath", "ceo", 200000000);
}
}