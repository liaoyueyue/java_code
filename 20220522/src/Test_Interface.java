/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-05-22
 * Time: 12:14
 */

class Animal{
    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("Animal.eat");
    }
}

class Dog extends Animal implements Iswimming,Irun{
    public Dog(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println(name+"正在吃骨头");
    }

    @Override
    public void run() {
        System.out.println(name+"正在用四条腿跑");
    }

    @Override
    public void swimming() {
        System.out.println(name+"正在狗刨游泳");
    }
}

class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println(name+"正在吃鱼");
    }
}

class Bord extends Animal implements Ifly{

    public Bord(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println(name+"正在用翅膀飞");
    }

    public void eat(){
        System.out.println(name+"正在鸟粮");
    }
}

interface Ifly {
    public void fly();
}
interface Irun {
    public void run();
}
interface Iswimming {
    public void swimming();
}

public class Test_Interface {
    public static void eat(Animal animal){    //这里复习之前的多态
        animal.eat();
    }
    public static void Ifly(Animal animal){     //这里利用向下转型来实现不同的类实现一样的方法是发生不同的效果
        if(animal instanceof Bord){
            ((Bord) animal).fly();//这里发生向下转型
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("旺财", 2);
        Bord bord = new Bord("麻雀", 2);
        Cat cat = new Cat("咪咪", 3);
        dog.run();//这里用接口实现的跑
        bord.fly();
        cat.eat();
        eat(dog);//这里会发生动态绑定，调用类特有的eat函数，没有则使用父类的eat函数
        eat(bord);
        eat(cat);
        Animal animal1 = bord;//这里发生向上转型
        Animal animal2 = dog;
        Ifly(animal1);
        Ifly(animal2);//因为dog不会飞所以不会执行
    }
}
