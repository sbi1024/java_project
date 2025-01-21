package ch02;

public class LocMem {
    // 클래스로 표현하는 객체별로 변수(상태)와 메서드(동작)를 선언
    // 멤버 변수는 객체가 존재하는한 지속된다.
    int num;
    String name;

    // 메서드
    // 파라미터와 메소드 내에서 선언된 변수 모두 메서드가 호출될때 만들어지고, 종료될때 사라진다.
    public int sum(int n1, int n2) {
        int n3 = 3;
//        if (n1 > n2) {
//            int n3 = 10;
//        }
        return n1 + n2 + n3;
    }
}
