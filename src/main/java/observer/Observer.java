package observer;


/**
 * 定义抽象观察者，为所有的观察者定义一个接口
 */
public interface Observer {

	void update(Subject subject);
	
}
