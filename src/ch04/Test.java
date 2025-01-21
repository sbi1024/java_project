package ch04;

public class Test {
    public static void main(String[] args) {
        // if else
        {
            int score = 75;
            if (score > 90) {
                if (score > 95) {

                } else {

                }
            } else if (score > 80) {

            } else if (score > 70) {

            } else {

            }

            if (score > 90) {

            }

            if (score > 80) {

            }
        }

        // switch
        {
//            int score = 10;
//            switch (score) {
//                case 5:
//                    System.out.println("A");
//                    break;
//                case 10:
//                    System.out.println("B");
//                    break;
//                case 15:
//                    System.out.println("C");
//                    break;
//                default:
//                    System.out.println("D");
//                    break;
//            }

            char ch = 'B';

            switch (ch) {
                case 'A':
                    System.out.println("A");
                    break;
                case 'B':
                    System.out.println("B");
                    break;
                case 'C':
                    System.out.println("C");
                    break;
//                case 66:
//
//                    // duplicate case
//                    System.out.println("66");
                default:
                    System.out.println("D");
            }

//            String str = "22";
//
//            switch (str) {
//                case "11", "22" :
//                    System.out.println("11, 22");
//                    break;
//                    // 람다는 : 과 함께 사용할 수 없다.
////                case "33" -> {
////                    System.out.println("33");
////                }
//                default:
//                    System.out.println("00");
//            }

            String str = "33";

            switch (str) {
                case "11, 22" -> System.out.println("11, 22");
                case "33" -> {
                    System.out.println("추가 작업");
                    System.out.println("33");
                }
                default -> System.out.println("00");
            }

        }


    }
}
