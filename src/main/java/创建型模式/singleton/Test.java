package 创建型模式.singleton;
/**
 * 优点：减少内存开销，尤其是频繁的创建和销毁
 * 缺点：不是面对接口的，不能继承，违反单一职责原则（又管理自己的功能，又负责创建自己）
 */
public class Test {

    public static void main(String[] args) {

        Hunger hunger = Hunger.getHunger();
        Hunger hunger2 = Hunger.getHunger();
        Lazy lazy = Lazy.getLazy();
        Lazy lazy2 = Lazy.getLazy();

        System.out.println(hunger.equals(hunger2));
        System.out.println(lazy.equals(lazy2));
    }
}
