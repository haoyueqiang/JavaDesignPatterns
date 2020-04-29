package factoryPatterns.abstractFactory;


public class Test {

	public static void main(String[] args) {
		//生产低端汽车
		CarFactory factory = new LowCarFacotry();
		Engine engine = factory.createEngine();
		Seat seat = factory.createSeat();
		Tyre tyre = factory.createTyre();
		engine.run();
		engine.start();
		seat.message();
		tyre.revolve();
		
	}

}
