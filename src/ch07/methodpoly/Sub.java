package ch07.methodpoly;

import java.io.IOException;

public class Sub extends Super {
//    @Override
//    int m() {
//        System.out.println("Sub - m()");
//        return 1;
//    }
//
//    @Override
//    B m2() {
//        System.out.println("Sub - m2()");
//        return new C();
//    }


    @Override
    protected void m3() {
        super.m3();
    }

    void m4() throws IOException {
        System.out.println("Super -m4()");
    }


    // ... 가변인자 오버라이딩 어떻게 하는가 ?
}
