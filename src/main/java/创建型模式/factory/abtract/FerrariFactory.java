package 创建型模式.factory.abtract;

public class FerrariFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Ferrari();
    }
}
