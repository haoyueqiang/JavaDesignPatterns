package decorator;


public class SmartPhone implements Phone {

	private Phone nonSmartPhone;
	
	public SmartPhone(Phone nonSmartPhone) {
		this.nonSmartPhone = nonSmartPhone;
	}
	
	//智能手机
	public void action() {
		nonSmartPhone.action();
		System.out.println("可以玩愤怒的小鸟！");
	}

}
