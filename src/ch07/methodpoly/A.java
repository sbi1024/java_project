package ch07.methodpoly;

public class A {
    void a() {
        System.out.println("A - a()");
    }
}

class B extends A {
    void a(int i) {
        System.out.println("B - a(int )");
    }
}

class C extends B {
}

class D extends C {
}
