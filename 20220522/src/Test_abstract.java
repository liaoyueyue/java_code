/**
 * Created with IntelliJ IDEA.
 * Description:这里测试抽象类
 * User: liaoyueyue
 * Date: 2022-05-22
 * Time: 18:24
 */

abstract class Shape{
    public abstract void draw();//被abstract修饰的方法，没有方法体
    abstract void calcArea();
    // 抽象类也是类，也可以增加普通方法和属性
    public double getArea(){
        return area;
    }

    protected double area;//面积
}

class Rect extends Shape{
    private double length;
    private double width;
    public Rect(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("矩形");
    }

    @Override
    void calcArea() {
        area = length*width;
    }
}

class Circle extends Shape{
    private double r;
    final private static double PI = 3.1415926;
    public Circle(double r){
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("圆");
    }

    @Override
    void calcArea() {
        area = PI*r*r;
    }
}

public class Test_abstract {
    private static void CalcArea(Shape shape){//求图形的面积
        shape.calcArea();//调用子类的面积计算方法计算面积
        System.out.println(shape.getArea());//打印图形的面积
    }
    public static void Draw(Shape shape){
        shape.draw();
    }

    public static void main(String[] args) {
        Rect rect = new Rect(3, 4);
        Circle circle = new Circle(2);
        Draw(rect);
        CalcArea(rect);
        System.out.println("矩形面积"+rect.area);
        Draw(circle);
        CalcArea(circle);
        System.out.println("圆面积"+circle.area);
    }
}
