public class Static {

    static int a = 2;
    int b = 3;

    // Can only use static methods and variables
    static void fn1() {
        ++a;
        System.out.println("Value of a is: " + a);
    }

    void fn2() {
        ++b;
        System.out.println("Value of b is: " + b);
    }

    static void fn3() {
        System.out.println("I am a static method.");
    }

    public static void main(String[] args) {

        Static s1 = new Static();
        fn1();
        s1.fn2();
        System.out.println("s1 b value is: " + s1.b);
        System.out.println("a value is: " + Static.a);

        Static s2 = new Static();
        System.out.println("s2 b value is : " + s2.b);
        System.out.println("a value is : " + Static.a);
    }
}
