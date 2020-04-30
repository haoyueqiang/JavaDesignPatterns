package test;


//正常收费子类
public class CashNormal1 extends Cashsuper{

	@Override
	public double acceptCash(double money) {
		return money;
	}

}
