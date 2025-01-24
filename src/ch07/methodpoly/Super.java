package ch07.methodpoly;

public class Super {
    int m() {
        System.out.println("Super - m()");
        return 1;
    }

    B m2() {
        System.out.println("Super - m2()");
        return new B();
    }

    protected void m3() {
        System.out.println("Super -m3()");
    }
}
