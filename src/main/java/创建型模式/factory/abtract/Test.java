package 创建型模式.factory.abtract;

/**
 * 优点：创建工厂接口，由工厂子类来确定实例化的具体产品类，而不是一股脑的交给一个总厂
 *      扩展一个产品也要对应的增加一个工厂，符合开闭原则
 * 缺点：
 */
public class Test {

    public static void main(String[] args) {
        CarFactory factory = new FerrariFactory();
        Car car = factory.getCar();
        car.brand();
    }
}
