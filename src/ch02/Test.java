package ch02;

public class Test {
    public static void main(String[] args) {

        // primitive 형변
//        byte b1 = 10;
//        int i1 = b1; // 자동 형변환
//        System.out.println(b1); // byte value 10
//        System.out.println(i1); // int value 10
//
//        byte b2 = (byte) i1; // 자동 형변환 X
//        System.out.println(b2);
//
//        byte b3 = (byte) 10000; // 강제 형변환 중 값 손실
//        System.out.println("b3 = " + b3);
//
//        byte b4 = 10;
//        byte b5 = 20;
//
//        int i6 = b4 + b5;
//        System.out.println(i6);
//
//        byte b6 = (byte) (b4 + b5);
//        System.out.println(b6);
//
//        // 문자열을 정수 int 로 변경
//        String intStr = "999";
//        int intVal = Integer.parseInt(intStr);
//        System.out.println(intVal);
//
//        String intStr2 = String.valueOf(intVal + 1);
//        System.out.println(intStr2);

        LocMem locMem1 = new LocMem();
        locMem1.num = 10;
        locMem1.name = "AAA";

        LocMem locMem2 = new LocMem();
        locMem2.num = 20;
        locMem2.name = "BBB";

        System.out.println("locMem1.sum(100,200) = " + locMem1.sum(100, 200));
        System.out.println("locMem2.sum(300,400) = " + locMem1.sum(300, 400));
    }
}
