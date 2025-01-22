package ch05;

public class Test2 {
    public static void main(String[] args) {
        // String 객체의 비교
        String str1 = new String("hello"); // 주사값 100
        String str2 = new String("hello"); // 주소값 200
        String str3 = "hello"; // 주소값 300
        String str4 = "hello"; // 주소값 300

        System.out.println(str1 == str2);
        System.out.println(str3 == str4);
        System.out.println(str1 == str4);

        // 리터럴 문자열 값이 같은 경우 주소값이 동일하다.

        // equals는 내부 문자열 값을 비교함
        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str4));
        System.out.println(str1.equals(str4));

        // MyClass 객체의 equals() 비교
        MyClass mc1 = new MyClass();
        mc1.name = "hello";

        MyClass mc2 = new MyClass();
        mc2.name = "hello";

        System.out.println(mc1.name);
        System.out.println(mc2.name);
        System.out.println(mc1.equals(mc2)); // false 참조 타입의 객체가 무조건 equals로 내용비교가 true가 되는건 아니다.

        // String의 다양한 메서드
        {
            String str = "hello";
            // length
            System.out.println(str.length());

            // charAt()
            System.out.println(str.charAt(0));

            // replace
            System.out.println(str.replace("he","aa"));
            System.out.println(str);

            // indexOf()
            System.out.println(str.indexOf("l"));

            // subString()
            System.out.println(str.substring(3, 5));
            System.out.println(str.substring(0, str.indexOf("l")) + "X" + str.substring(str.indexOf("l") + 1, str.length()));
        }
    }
}
