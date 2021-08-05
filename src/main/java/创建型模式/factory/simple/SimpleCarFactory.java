package 创建型模式.factory.simple;

public class SimpleCarFactory {

    public Car getCar(String brandName) {
        if (brandName.equals("Tesla")) {
            return new Tesla();
        } else if (brandName.equals("Ferrari")) {
            return new Ferrari();
        }
        return null;
    }
}
