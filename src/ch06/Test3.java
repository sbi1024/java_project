package ch06;

public class Test3 {
    public static void main(String[] args) {
//        MyClass mc = new MyClass();
//        System.out.println(mc.num);

        // 2. 생성자를 통한 초기화
        // final 필드를 지정하는 생성자를 호출
        {
            MyClass mc = new MyClass(20);
            System.out.println(mc.num);

        }
    }
}
