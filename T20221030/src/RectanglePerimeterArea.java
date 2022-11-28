import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Problem:长方形的周长和面积
 * Name: 严显鹏
 * Class: 21软工本1
 * Date: 2022-10-30
 */
public class RectanglePerimeterArea {
    public static void main(String[] args) {
        double length, width;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入长方形的长和宽：");
        length = in.nextDouble();
        width = in.nextDouble();
        System.out.println("长方形的周长和面积分别为："+2*(length+width)+", "+length*width );
    }
}
