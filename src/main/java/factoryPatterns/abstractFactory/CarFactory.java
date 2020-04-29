package factoryPatterns.abstractFactory;

//汽车工厂
public interface CarFactory {

	Engine createEngine();// 生产发动机

	Seat createSeat();// 创建座椅

	Tyre createTyre();// 创建轮胎
}
