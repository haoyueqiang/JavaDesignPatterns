package singleton;


public class Test {

	public static void main(String[] args) {
		System.out.println("v+"+Singleton.getInstance());;

		Emperor emp1 = Emperor.getInstance();
		emp1.empInfo();
		
		Emperor emp2 = Emperor.getInstance();
		emp2.empInfo();
		
		Emperor emp3 = Emperor.getInstance();
		emp3.empInfo();
	}

}
