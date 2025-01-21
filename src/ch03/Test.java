package ch03;

public class Test {
    public static void main(String[] args) {
        // 증감 연산자
//        int x = 10;
//        int y = 10;
//
//        x++;
//        ++x;
//
//        System.out.println(x);
//        System.out.println(++x); // println()에 값이 전달되기 전에 x가 1증가된다.
//        System.out.println(x++); // println()에 값이 전달되고 난 후 x가 1증가된다.
//        System.out.println(x);
//
//        System.out.println("========================");
//
//        // 여러분이 y로 -- 테스트 코드 작성
//
//        y++;
//        ++y;
//
//
//        System.out.println(y);
//        System.out.println(++y);
//        System.out.println(y++);
//        System.out.println(y);
//
//        System.out.println("========================");

        // 논리 연산자
        {
            int x = 10;
            int y = 10;

//            if (++x == 10 &&  y++ == 10) {
//                System.out.println("A");
//            } else {
//                System.out.println("B");
//            }
            if (++x == 11 && y++ == 10) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }

            // x와 y가 모두 11이다.
            System.out.println(x);
            System.out.println(y);

            if (++x == 12 && y++ == 11) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }

            // x와 y가 모두 12
            System.out.println(x);
            System.out.println(y);

            // && -> ||
            // || -> |  쇼트 서킷이 뭐지 ? 전체판명이 나더라도 나머지 판명을 이어간다. 결과적으로 y도 13이 된다.
            if (++x == 13 | y++ == 12) {
                System.out.println("E");
            } else {
                System.out.println("F");
            }
            // x는 먼저 비교가되어서 true로 판명되었음
            // 다만 y는 x비교식에서 true로 이미 판명되었기에 전체 OR 연산이 true가 되었기 떄문에 y++ == 10 인 비교식은 수행하지 않음
            // x는 13, y는 12
            System.out.println(x);
            System.out.println(y);

            // 여러분은 OR ||로 진행하면서 &&, & 하는 예제를 만들어 보세요.
            // 조별활동에서 결과값을 예측하는 퀴즈로 만들어보면 좋다.

            // 증감연산자와 논리연산자를 섞어서 한번 해보자.
        }
    }
}
