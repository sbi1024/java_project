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

// 1번 4
// 2번 2
// 3번 4
// 4번 3
// 5번 3 1 2 4
// 6번 4
// 7번 1 2 3 4
// 8번
// ============
// 1번 4
// 2번 2 3 6 7
// 3번 byte short int long char float double boolean
// 4번 int double , age price , 15 3.14
// 5번 3
// 6번 4
// 7번 3
// 8번 안품
// 9번 1
// 10번 2
// 11번 13, 16 라인
