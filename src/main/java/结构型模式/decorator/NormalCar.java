package 结构型模式.decorator;

public class NormalCar implements Car{
    @Override
    public void drive() {
        System.out.println("我们可以边开车边听歌");
    }
}
