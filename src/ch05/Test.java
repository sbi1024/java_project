package ch05;

public class Test {
    public static void main(String[] args) {
        // 참조 타입의 객체를 생성하고 == 비교
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        MyClass mc3 = mc1;


        System.out.println(mc1 == mc2);
        System.out.println(mc1 == mc3);

        // null
        System.out.println(mc1);
        // local 변수는 사용 전 반드시 초기화가 되어야 한다.
        MyClass mc4 = null; // 가르키는 객체가 없다. 명시적으로 표현할때  null
        System.out.println(mc4);

        mc4 = getObject();
        System.out.println(mc4); // 정상적인 객체인 경우 클래스정보 + heap 참조 출력, null 일 경우 "null" 출력
        System.out.println(mc4.getName()); // mc4 가 null 인경우  NPE가 발생함
    }

    static MyClass getObject() {
//        return new MyClass();
        return null;
    }
}
