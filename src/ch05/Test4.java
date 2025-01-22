package ch05;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        // 다차원 배열
        {
            int[] intArray = new int[4]; // 1차원 배열
            int[][] intArray2 = new int[4][3]; // 2차원 배열
            int[][] intArray3 = new int[4][]; // 2차원 배열이지만, 1차원까지만 만들어 진다.
            intArray3[0] = new int[4];
            intArray3[1] = new int[2];
            intArray3[2] = new int[1];
            intArray3[3] = new int[3];
        }

        // 배열 + for문
        {
            int[] intArray = {1, 2, 3, 4};
            for (int i = 0; i < intArray.length; i++) {
                System.out.println(i);
                intArray[i]++;
            }
            System.out.println(Arrays.toString(intArray));
            for (int i : intArray) {
                System.out.println(i);
                i++; // 원본은 변한없이 로컬변수만 변경되고 있음
            }
            System.out.println(Arrays.toString(intArray));
        }
    }
}
