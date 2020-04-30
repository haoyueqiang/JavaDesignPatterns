package decorator;


public class NonSmartPhone implements Phone {

	//非智能手机只有打电话的功能
	public void action() {
		System.out.println("只能打电话******");
	}

}
