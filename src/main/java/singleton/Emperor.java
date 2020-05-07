package singleton;


public class Emperor {

	private static Emperor emperor = null;
	
	private  Emperor() {
		
	}
	
	public static Emperor getInstance() {
		if (emperor == null) {
			emperor = new Emperor();
		}
		return emperor;
	}
	
	public static void empInfo() {
		System.out.println("AAA");
	}
	
}
