/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-05-15
 * Time: 20:35
 */

class Shape{
    public void draw(){

        System.out.println("这是一个圆");
    }
 }
 class Rest extends Shape{
     @Override
     public void draw() {

         System.out.println("这是一个矩形");
     }
 }
 class Flower extends Shape{
     @Override
     public void draw() {
         System.out.println("这是一朵花");
     }
 }

public class TestDemo {
    public static void drawMap(Shape shape){
        shape.draw();
    }


    public static void main(String[] args) {
        drawMap(new Flower());
        drawMap(new Rest());
    }
}
