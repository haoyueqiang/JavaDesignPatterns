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
		
		System.out.println("----------------------------------");
		
		//生产高端汽车
		CarFactory factoryLuxury = new LuxuryCarFactory();
		Engine engineLuxury = factoryLuxury.createEngine();
		Seat seatLuxury = factoryLuxury.createSeat();
		Tyre tyreLuxury = factoryLuxury.createTyre();
		engineLuxury.run();
		engineLuxury.start();
		seatLuxury.message();
		tyreLuxury.revolve();
		
		
	}

}
