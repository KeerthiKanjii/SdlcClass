package Polymorpism1;

public class OverLoading {
	
	public void student1(String name,int RollNo) {
		System.out.println( name+RollNo);
	}
	
	
	public void student2(int RollNo,String name) {
		System.out.println( RollNo+name);
	}
	
	public static void main(String[] args) {

		OverLoading obj = new OverLoading() ;
		
		obj.student1("keerthi", 1);
		obj.student2(2, "vaishu");
	}

}
