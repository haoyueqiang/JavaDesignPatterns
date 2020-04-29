package factoryPatterns.simpleFactory;

public class TestMagnate {

	public static void main(String[] args) {

		try {
			// 告訴司機
			Car car = DriverFactory.driverCar("Bmw");
			car.driver();//执行开车动作
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
