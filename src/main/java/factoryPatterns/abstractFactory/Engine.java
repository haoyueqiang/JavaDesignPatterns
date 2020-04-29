package factoryPatterns.abstractFactory;

//发动机接口
public interface Engine {

	void run();

	void start();

}

//好点的发动机
class LuxuryEngine implements Engine {

	public void run() {
		System.out.println("好的发动机转的快");
	}

	public void start() {
		System.out.println("启动也快，自动启停");
	}

}

// 差一点的发动机
class LowEngine implements Engine {

	public void run() {
		System.out.println("差点的发动机转的慢");
	}

	public void start() {
		System.out.println("启动慢");
	}

}