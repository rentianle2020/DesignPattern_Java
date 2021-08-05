package 结构型模式.decorator;

public class CarDecorator implements Car{

    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    public void drive(){
        car.drive();
    }

    public void decorateDrive(){
        car.drive();
        System.out.println("现在车车变得更好看！可以边开车边受到路人围观啦！");
    }
}
