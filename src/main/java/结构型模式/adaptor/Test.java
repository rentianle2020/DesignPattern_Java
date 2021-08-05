package 结构型模式.adaptor;

/**
 * 不同于装饰着模式，适配器模式的目标是完成两个类的适配，而不是扩展原有功能
 * 优点：可以让任何两个没有关联的类一起运行（0耦合），符合开闭原则
 * 缺点：
 */
public class Test {

    public static void main(String[] args) {

        Adaptee EnglishMC = new Adaptee();
        Adaptor ChineseAudience = new Adaptor(EnglishMC);

        String listen = ChineseAudience.ListenChinese();
        System.out.println(listen);

    }
}
