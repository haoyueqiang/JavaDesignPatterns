package test;

//返利收费子类
public class CashReturn extends Cashsuper {

	private double moneyCodition = 0.0d;

	private double moneyReturn = 0.0d;

	/**
	 * 
	 * @param moneyCondition 返利条件
	 * @param moneyReturn    返利值
	 */
	public CashReturn(String moneyCondition, String moneyReturn) {
		this.moneyCodition = Double.parseDouble(moneyCondition);
		this.moneyReturn = Double.parseDouble(moneyReturn);
	}

	@Override
	public double acceptCash(double money) {
		double result = money;
		if (money >= moneyCodition) {
			result = money - Math.floor(money / moneyCodition * moneyReturn); 
		}
		return result;
	}

}
