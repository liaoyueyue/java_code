public class TestDemo {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++) {
            System.out.println(args[i]);
        }
    }


    public static void fun1(String[] args) {
        System.out.println("Hello World");
        System.out.print("Hello World");
        System.out.printf("%s","Hello World");
    }
}
