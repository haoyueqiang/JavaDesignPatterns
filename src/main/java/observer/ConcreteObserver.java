package observer;

/**
 * 具体的观察者
 */
public class ConcreteObserver implements Observer{

	private int state;//state对象需要和subject中的对象保持一致

	public void update(Subject subject) {
		
	}
	

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
}
