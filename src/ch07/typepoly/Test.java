package ch07.typepoly;

public class Test {
    public static void main(String[] args) {
        // 타입 다형성 = assign
        {
            A a = new A();
            B b = new B();
            A aa = new B();
            // B b = new A();
        }

        // 타입 다형성 : parameter
        {
            A a = new A();
            B b = new B();

            m1(a);
            m1(b);
//            m2(a);
            m2(b);
        }

    }


    // 타입 다형성 : parameter
    static void m1(A a) {}
    static void m2(B a) {}
    static A m3(){return new A();}
    static B m4(){return new B();}
    static A m5(){return new B();}
//    static B m6(){return new A();}

    // 자식타입의  <= 부모객체 일 경우 오류 발생
}
