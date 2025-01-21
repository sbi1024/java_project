package ch04;

public class Test2 {
    public static void main(String[] args) {
        String grade = "B";
        int score = switch (grade) {
            case "A" -> 100; // 단순 리터럴 반환
            case "B" -> {
                int deduction = 20;  // 블록 내에서 연산 수행
                int result = 100 - deduction;
                yield result;        // 연산 결과 반환
            }
            default -> 60;           // 기본값 반환
        };
        System.out.println(score); // 출력: 80
    }
}
