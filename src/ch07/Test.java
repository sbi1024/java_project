package ch07;

public class Test {
    public static void main(String[] args) {
        {
            Child child = new Child();
            child.m();
        }

        {
            Parents p = new Child();
            Child c = new Child();
            Parents p2 = c;
            c.m();

            // 컴파일러가 체크하지 못하는 런타임 오류
            Child c2 = (Child) new Parents(1);

            // 명시적으로 캐스팅 하는 것은 되도록 지양
        }
    }
}
