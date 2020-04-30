package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题对象：把所有观察者对象都保存到一个集合里，每个主题都有任何数量的观察者
 * 抽象主题对象体用了增加和删除观察者的方法
 */
public class Subject {

	public List<Observer> list = new ArrayList<Observer>();
	
	//添加观察者
	public void registerObserver(Observer observer) {
		if (observer !=null) {
			list.add(observer);
		}
	}
	
	//删除观察者
	public void remove(Observer observer) {
		if (observer !=null) {
			list.remove(observer);
		}
	}
	
	// 通知所有观察者
	public void notifyAllObserver() {
		for (Observer observer : list) {
			observer.update(this);
		}
	}
	
}
