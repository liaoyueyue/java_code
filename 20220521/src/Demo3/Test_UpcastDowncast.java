package Demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:这里测试向上转型和向下转型
 * User: liaoyueyue
 * Date: 2022-05-21
 * Time: 13:31
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

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Demo1.Demo3.Dog.eat");
    }
    public Dog(String name, int age) {
        super(name, age);
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Demo3.Cat.eat");
    }

    public Cat(String name, int age) {
        super(name, age);
    }
}




public class Test_UpcastDowncast {
    public static void eat(Animal animal) {
        animal.eat();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("旺财", 2);
        Cat cat = new Cat("咪咪", 3);
        eat(dog);//这里的向上转型
        eat(cat);

        /**
         * 向下转型用的比较少，而且不安全，万一转换失败，运行时就会抛异常。Java中为了提高向下转型的安全性，
         * 引入了 instanceof ，如果该表达式为true，则可以安全转换。
         */
        Animal animal = dog;
        if(animal instanceof Dog){
            dog = (Dog) animal;
        }





    }
}