package ch05;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
//        // 배열 선언
//        {
//            int[] intArray; // 일반적
//            int intArray2[];
//        }
//        // 배열 생성
//        {
//            int[] intArray = new int[5]; // 길이가 5인 int 배열 객체가 heap에 생성
//            int[] intArray2 = {1, 2, 3, 4, 5};
//            int a = 10;
//            int b = 20;
//            int[] intArray3 = {a, b};
//            int[] intArray4 = new int[]{1, 2, 3, a, b};
//
//            System.out.println(intArray);
//            System.out.println(intArray2);
//            System.out.println(intArray3);
//            System.out.println(intArray4);
//
//            // 배열의 항목을 출력하려면 Arrays.toString()을 호출
////            System.out.println(Arrays.toString(intArray));
////            System.out.println(Arrays.toString(intArray2));
////            System.out.println(Arrays.toString(intArray3));
////            System.out.println(Arrays.toString(intArray4));
//
//            intArray[2] = 10;
//            System.out.println(Arrays.toString(intArray));
//            System.out.println(intArray[2]);
//        }
//
//        // String []
//        {
//            String[] strArray = {"Hello", "World", "Java"};
////            System.out.println(Arrays.toString(strArray));
//
//            System.out.println("strArray[2].length() = " + strArray[2].length());
//        }

        // MyClass []
        {
            MyClass[] mcArray = new MyClass[3];
            System.out.println(Arrays.toString(mcArray));
            mcArray[1] = new MyClass();
            System.out.println(Arrays.toString(mcArray));
            mcArray[1].name = "ABC";
            System.out.println(mcArray[1].name);
            System.out.println(mcArray[0].name); // 에러
        }



        // 배열길이
        {
            int[] intArray = {1, 3, 5, 7, 9};
            System.out.println(intArray.length);

        }
    }


}
