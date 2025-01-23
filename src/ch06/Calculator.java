package ch06;

public class Calculator {
    // static initializer
    {
        System.out.println(1);
    }

    int sum;
    static double pi = 3.1415;

    static int plus(int a, int b) {
        // sum은 static 변수가 아니기에, 접근이 불가하다.
        // return sum += a + b;
        return a + b;
    }

    {
        System.out.println(2);
    }
}
