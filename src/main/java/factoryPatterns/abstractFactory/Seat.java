package factoryPatterns.abstractFactory;

//座椅
public interface Seat {

	void message();// 按摩

}

//高端座椅
class LuxurySeat implements Seat{

	public void message() {
		System.out.println("可以按摩******");
	}
	
}

//低端座椅
class LowSeat implements Seat{

	public void message() {
		System.out.println("不能按摩*******");
	}
	
}