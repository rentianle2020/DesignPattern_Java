package 创建型模式.factory.simple;

/**
 * 优点：1、知道想要获得的类名即可 2、增加产品品类，增加一个新的工厂即可 3、屏蔽了复杂的内部实现
 * 缺点：如果想给工厂增加一个产品，需要改动工厂代码；违反开闭原则
 */
public interface Car {

    void brand();
}
