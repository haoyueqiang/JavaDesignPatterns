package factoryPatterns.abstractFactory;


//低端汽车
public class LowCarFacotry implements CarFactory{

	public Engine createEngine() {
		return new LowEngine();
	}

	public Seat createSeat() {
		return new LowSeat();
	}

	public Tyre createTyre() {
		return new LowTyre();
	}

}
