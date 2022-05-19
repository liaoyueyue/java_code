/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-05-19
 * Time: 21:22
 */

class Animal{//动物的基本属性
    String name;
    int age;
    float weight;

    public void eat(){
        System.out.println("正在吃东西");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("汪汪汪");
    }

    @Override
    public void eat() {
        System.out.println("旺财正在吃骨头");
    }
}
class Cat extends Animal{
    public void mew(){
        System.out.println("喵喵喵");
    }

    @Override
    public void eat() {
        System.out.println("肥波正在吃鱼");
    }
}

public class Test_inherit {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "旺财";
        dog.age = 3;
        dog.weight = 44;
        dog.bark();
        dog.eat();


        Cat cat = new Cat();
        cat.name = "肥波";
        cat.age = 4;
        cat.weight = 55;
        cat.mew();
        cat.eat();

    }
}
