package ch08;

public interface YourIF {
//    void m2();
//
//    int MAX = 10;
//
//    default void m3() {
//        System.out.println(MAX);
//    }

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int a, b, c, d = 0;

        if (x < y) {
            a = 11;
            b = 22;
        } else {
            a = 22;
            b = 11;
        }

        if (x < y) {
            c = 33;
        }

        try {
            d = 44;
        } catch (Exception e) {
            // 여기서 출력
        }
    }

}
