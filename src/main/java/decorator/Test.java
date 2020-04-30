package decorator;

public class Test {

	public static void main(String[] args) {
		Phone nonPhone = new NonSmartPhone();
		System.out.println("装饰之前--------------------------");
		nonPhone.action();
		System.out.println("装饰之后---------------------------");
		Phone smartPhone = new SmartPhone(nonPhone);
		smartPhone.action();
	}

}
