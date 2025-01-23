package ch06;

public class Test2 {
    static {
        System.out.println("X");
    }
    public static void main(String[] args) {
        System.out.println(Calculator.pi);

        System.out.println(Calculator.plus(10, 20));

        Calculator c = new Calculator();
        System.out.println(c.pi);

        // non-static method call
        // hello(); > 컴파일 오류가 발생함
        hello2();
    }

    public void hello() { // non-static method

    }

    public static void hello2() {}

    static {
        System.out.println("Y");
    }
}
