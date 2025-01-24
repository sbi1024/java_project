package ch08;

public class Test {
    public static void main(String[] args) {
        // 인터페이스와 이를 구현한 클래스의 객체
        MyIFImpl impl = new MyIFImpl();
        MyIFImpl2 impl2 = new MyIFImpl2();

        impl.m();
        impl2.m();

        MyIF impl3 = new MyIFImpl();
        MyIF impl4 = new MyIFImpl2();

        impl3.m();
        impl4.m();


    }

    static MyIF getMyIFImpl() {
        return new MyIFImpl();
    }
}
