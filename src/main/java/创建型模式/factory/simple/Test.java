package 创建型模式.factory.simple;

/**
 * 优点：根据参数返回不同的类实力，有效屏蔽了复杂的内部实现；创建和使用的分离
 * 缺点：不够灵活，如果增加实现类，需要累加工厂类代码，违反开闭原则
 */
public class Test {

    public static void main(String[] args) {
        SimpleCarFactory factory = new SimpleCarFactory();

        Car tesla = factory.getCar("Tesla");
        tesla.brand();
    }
}
