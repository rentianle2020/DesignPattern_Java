package 创建型模式.factory.abtract;

public class Tesla implements Car {
    @Override
    public void brand() {
        System.out.println("我是特斯拉！");
    }
}
