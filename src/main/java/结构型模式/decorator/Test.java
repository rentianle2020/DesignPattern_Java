package 结构型模式.decorator;

/**
 * 优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。
 */
public class Test {

    public static void main(String[] args) {

        CarDecorator decorator = new CarDecorator(new NormalCar());
        decorator.drive();
        System.out.println("-----被装饰后-----");
        decorator.decorateDrive();
    }

}
