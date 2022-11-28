import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-11-27
 * Time: 15:57
 */

class Car1 {
    private String Brand;
    private double price;
    private double discountPrice;

    public Car1(String Brand, double price) {
        this.Brand = Brand;
        this.price = price;
    }

    public void setDiscountPrice() {
        Scanner in = new Scanner(System.in);
        double discount;
        System.out.println("输入你的折扣");
        discount = in.nextDouble();
        discountPrice = price * (discount / 10);
        System.out.println("已经设置优惠价");
    }

    @Override
    public String toString() {
        return "Car{" +
                "plateNumber='" + Brand + '\'' +
                ", price=" + price +
                ", discountPrice=" + discountPrice +
                '}';
    }
}

public class Example1 {
    public static void main(String[] args) {
        Car1 car = new Car1("宝马7", 45_0000);
        System.out.println(car.toString());
        car.setDiscountPrice();
        System.out.println(car.toString());
    }
}
