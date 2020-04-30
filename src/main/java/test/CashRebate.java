package test;


//打折收费子类
public class CashRebate extends Cashsuper{
	
	private double moneyRebate = 1d;
	
	public CashRebate(String moneyRebate) {
		this.moneyRebate = Double.parseDouble(moneyRebate);
	}
	

	@Override
	public double acceptCash(double money) {
		return money * moneyRebate;
	}

}
