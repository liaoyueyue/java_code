/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-05-19
 * Time: 17:51
 */

/**
 * 这里测试内部类访问外部类
 */
class OuterClass {
    public int data1 = 1;
    private int data2 = 2;
    public static int data3 = 3;

    class InnerClass {
        public int data1 = 1111;
        public int data4 = 4;
        private int data5 = 5;
        public static final int data6 = 6;

        public void print(){
            System.out.println(OuterClass.this.data1);
            System.out.println(this.data1);
            System.out.println(OuterClass.this.data2);
            System.out.println(OuterClass.data3);
            System.out.println(this.data4);
            System.out.println(this.data5);
            System.out.println(this.data6);
        }

        public InnerClass(){
            System.out.println("InnerClass.InnerClass");
        }
    }

    /**
     * 这里测试外部类访问内部类
     */



    public void func(){
        System.out.println("OuterClass.func");
        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        System.out.println(innerClass.data1);
        System.out.println(data1);
    }
    public OuterClass(){
        System.out.println("OuterClass.OuterClass");
    }

}


public class Test_InnerClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.print();
        outerClass.func();
    }

}

/**
 *  实例内部类
 * 1. 外部类中的任何成员都可以被在实例内部类方法中直接访问
 * 2. 实例内部类所处的位置与外部类成员位置相同，因此也受public、private等访问限定符的约束
 * 3. 在实例内部类方法中访问同名的成员时，优先访问自己的，如果要访问外部类同名的成员，必须：外部类名
 * 称.this.同名成员 来访问
 * 4. 实例内部类对象必须在先有外部类对象前提下才能创建
 * 5. 实例内部类的非静态方法中包含了一个指向外部类对象的引用
 * 6. 外部类中，不能直接访问实例内部类中的成员，如果要访问必须先要创建外部类的对象。
 */
