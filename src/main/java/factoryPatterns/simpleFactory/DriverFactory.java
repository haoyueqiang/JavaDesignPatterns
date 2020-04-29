package factoryPatterns.simpleFactory;

//工厂类角色
public class DriverFactory {

	//工厂方法返回的是 抽象产品的角色
	public static Car driverCar(String str) throws Exception{
		//逻辑判断
		if (str.equalsIgnoreCase("Beanz")) {
			return new Beanz();
		}else if (str.equalsIgnoreCase("Bmw")) {
			return new Bmw();
		}else if (str.equalsIgnoreCase("Audi")) {
			return new Audi();
		}else {
			throw new Exception();
		}	
	}
	
}
