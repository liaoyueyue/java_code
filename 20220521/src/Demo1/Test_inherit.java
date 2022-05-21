package Demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:这里测试多态用法
 * User: liaoyueyue
 * Date: 2022-05-21
 * Time: 12:15
 */

class Animal{
    String name;
    int age;
    public void eat(){
        System.out.println(name+"正在吃饭");
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Dog extends Animal{
    @Override
    public void eat() {     //这里重写父类的eat函数
        System.out.println(name+"正在吃骨头");
    }
    public Dog(String name, int age) {
        super(name, age);
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println(name+"正在吃鱼");
    }
    public Cat(String name, int age){
        super(name, age);
    }
}



public class Test_inherit {
    public static void eat(Animal animal){
        animal.eat();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("旺财", 2);
        Cat cat = new Cat("元宝", 2);
        eat(dog);//这里发生了向上转型
        eat(cat);

    }
}

/**
 * 在java中要实现多态，必须要满足如下几个条件，缺一不可：
 * 1. 必须在继承体系下
 * 2. 子类必须要对父类中方法进行重写
 * 3. 通过父类的引用调用重写的方法
 */
