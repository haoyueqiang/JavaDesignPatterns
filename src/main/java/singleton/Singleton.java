package singleton;

/**
 * 单例模式又叫做单态模式 或者 单件模式
 * 
 * 在 GOF 书中给出的定义为：保证一个类仅有 一个实例，并提供一个访问它的全局访问点。单例模式中的“单例”通常用来代表那些本质上
 * 具有唯一性的系统组件（或者叫做资源）。比如文件系统、资源管理器等等。
 *
 * 一个类对象的产生是由类构造行数来完成的，如果想限制对象的产生，一个办法就是将构造函数变为私有（至少是受保护的），
 * 使得外面的类不能通过引用来产生对象；同时为了保证类的可用性，就必须提供一个自己的对象以及访问这个对象的方法。
 */
public class Singleton {

	// 在自己内部定义一个实例，注意这里是 private，只供内部调用
	private static Singleton instance = new Singleton();

	// 函数设置为私有的
	private Singleton() {

	}

	// 静态工厂方法，提供了一个供外部访问得到的对象的静态方法
	public static Singleton getInstance() {
		return instance;
	}

}
