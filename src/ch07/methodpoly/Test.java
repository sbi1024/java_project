package ch07.methodpoly;

public class Test {
    public static void main(String[] args) {
        MyClass mc = new MyClass();

        System.out.println(mc);

        // equals, hashcode
        // 동일성 동등성

        MyClass mc1 = new MyClass();
        mc1.n = 10;
        mc1.str = "Hello";

        MyClass mc2 = new MyClass();
        mc2.n = 10;
        mc2.str = "Hello";

        System.out.println(mc1 == mc2);
        System.out.println(mc1.equals(mc2));
    }
}
