package factoryPatterns.abstractFactory;

//轮胎
public interface Tyre {

	void revolve();// 旋转

}

//高端轮胎
class LuxuryType implements Tyre {

	public void revolve() {
		System.out.println("轮胎转的快******");
	}

}

class LowTyre implements Tyre{
	public void revolve() {
		System.out.println("轮胎转的慢******");
	}

}
