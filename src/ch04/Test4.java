package ch04;

public class Test4 {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//            if (i == 5) {
//                break;
//                // 0 ~ 4 출력 후 break
//            }
//        }

//        for (int i = 0; i < 10; i++) {
//            if (i == 5) {
//                continue;
//            }
//            System.out.println(i);
//        }

        for (int i = 0; i < 10; i++) {
//            if (i == 5) {
//                continue;
//            }

            for (int j = 0; j < 10; j++) {
                if (j == 5) continue; // j가 5인 열이 제외
                System.out.print(i + " " + j + "  ");
            }
            System.out.println();
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        String grade = "B";
        int score = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };
        System.out.println(score);
    }
}

// 1번 : 31
// 2번 : 가
// 3번 : 534 / 30, 534 % 30
// 4번 : value / 100 * 100
// 5번 : 123
// 6번 : true false
// 7번 : Double.isNan(z)


// 1번 : 2
// 2번 :
// 3번 :
/**
 * int sum = 0;
 * for (int i = 0; i < 100; i++) {
 * if (i % 3 == 0) {
 * sum += i;
 * }
 * }
 * System.out.println("3의 배수의 합 : " + sum);
 */
// 4번 :
/**
 * while (true) {
 * int x = (int) (Math.random() * 6) + 1;
 * int y = (int) (Math.random() * 6) + 1;
 * System.out.println("x, y : " + x + " " + y);
 * if (x + y == 5) {
 * break;
 * }
 * }
 */
// 5번 :
/**
 * for (int i = 1; i <= 10; i++) {
 * for (int j = 1; j <= 10; j++) {
 * int x = 4 * i;
 * int y = 5 * j;
 * if (x + y == 60) {
 * System.out.println("(i, j) :" + "(" + i + "," + j + ")");
 * }
 * }
 * }
 */
// 6번 :
/**
 * for (int i = 0; i < 5; i++) {
 * for (int j = 0; j <= i; j++) {
 * System.out.print("*");
 * }
 * System.out.println();
 * }
 */
// 7번 :
/**
 * String grade = "B";
 * int score = switch (grade) {
 * case "A" -> 100;
 * case "B" -> {
 * int result = 100 - 20;
 * yield result;
 * }
 * default -> 60;
 * };
 * System.out.println(score);
 */