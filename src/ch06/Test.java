package ch06;

public class Test {
    public static void main(String[] args) {
        // 생성자 없는 경우
        // 컴파이러가 기본 생성자를 추가
        {
            Car car = new Car(1);
            System.out.println(car);
//        Car car1 = new Car(1);
        }

        // 생성자 1개 추가
        // 컴파이러가 기본생성자를 추가X

        {
            Car car2 = new Car(1);
            System.out.println(car2);
        }

    }
}
