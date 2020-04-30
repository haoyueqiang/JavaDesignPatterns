### 装饰者模式

1. 抽象构建角色（Component）：定义一个抽象接口，以规范准备接受附加责任的对象。
2. 具体构建角色（Concrete Component）:这是被装饰者，定义一个将要被装饰增加功能的类。
3. 装饰着角色（Decorator）：持有一个构建对象的实例，并定义了抽象构建定义的接口。
4. 具体装饰角色（Concrete Decorator）:负责给构建添加新增的功能。