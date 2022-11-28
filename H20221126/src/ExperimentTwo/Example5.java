package ExperimentTwo;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:试编写程序，实现求几何形状（长方形、正方形、圆形）的周长、面积。
 * User: liaoyueyue
 * Date: 2022-11-26
 * Time: 14:04
 */

public class Example5 {
    public static void main(String[] args) {
        do {
            menu();
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    //长方形
                    System.out.println("输入长度和宽度：");
                    double length = in.nextDouble();
                    double wide = in.nextDouble();
                    Rectangle rectangle = new Rectangle(length, wide);
                    System.out.println("长为" + rectangle.getLength() + "，宽为" + rectangle.getWide() +"的长方形周长为：" + rectangle.getPerimeter());
                    System.out.println("长为" + rectangle.getLength() + "，宽为" + rectangle.getWide() +"的长方形面积为：" + rectangle.getArea());
                    break;
                case 2:
                    //正方形
                    System.out.println("输入宽度：");
                    wide = in.nextDouble();
                    Square square = new Square(wide);
                    System.out.println("宽度为" + square.getWide() +"的正方形周长为：" + square.getPerimeter());
                    System.out.println("宽度为" + square.getWide() +"的正方形面积为：" + square.getArea());
                    break;
                case 3:
                    //圆形
                    System.out.println("输入半径：");
                    double radius = in.nextDouble();
                    Circular circular = new Circular(radius);
                    System.out.printf("半径为 %.2f 的圆形周长为：%.2f\n", circular.getRadius(),circular.getPerimeter());
                    System.out.printf("半径为 %.2f 的圆形面积为：%.2f\n", circular.getRadius(),circular.getArea());
                    break;
                default:
                    System.out.println("输入错误，请重新选择");
                    System.out.println();
                    break;
            }
        } while (true);
    }

    public static void menu() {
        System.out.println("******************   几何形状面积和体积   ********************");
        System.out.println("******************    1、长方形         ********************");
        System.out.println("******************    2、正方形         ********************");
        System.out.println("******************    3、圆形           ********************");
        System.out.println("******************    0、退出程序        ********************");
        System.out.println("***********************************************************");
    }
}

abstract class Shape{

    double perimeter;
    double area;

    public abstract double getPerimeter();

    public abstract double getArea();

}

/**
 * 长方形
 */
class Rectangle extends Shape{
    private double length;
    private double wide;

    public Rectangle(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * (length + wide);
        return perimeter;
    }

    @Override
    public double getArea() {
        area = length * wide;
        return area;
    }
}

/**
 * 正方形
 */
class Square extends Shape{
    private double wide;

    public Square(double wide) {
        this.wide = wide;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    @Override
    public double getPerimeter() {
        perimeter = 4 * wide;
        return perimeter;
    }

    @Override
    public double getArea() {
        area = wide * wide;
        return area;
    }
}

/**
 * 圆形
 */
class Circular extends Shape{
    public static final double PI = 3.1415926;
    private double radius;

    public Circular(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2*PI*radius;
        return perimeter;
    }

    @Override
    public double getArea() {
        area = PI*radius*radius;
        return area;
    }
}
