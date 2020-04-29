package factoryPatterns.abstractFactory;


public class LuxuryCarFactory implements CarFactory {

	public Engine createEngine() {
		return new LuxuryEngine();
	}

	public Seat createSeat() {
		return new LuxurySeat();
	}

	public Tyre createTyre() {
		return new LuxuryType();
	}

}
