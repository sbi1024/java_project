package ch13;

public class Test {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.content = "Hello";

        Box<Integer> box2 = new Box<>();
        box2.content = 10;


        Product<TV, String> product1 = new Product<>();
        product1.setKind(new TV());
        product1.setModel("OLED");

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("제네시스");

//        HomeAgency homeAgency = new HomeAgency();
//        Home home = homeAgency.rent();
//
//        CarAgency carAgency = new CarAgency();
//        Car car = carAgency.rent();

        Rentable<Home> homeAgency = new HomeAgency();
        Home home = homeAgency.rent();

        Rentable<Car> carAgency = new CarAgency();
        Car car = carAgency.rent();

        // Test 클래스에는 generic 이 없다.

        Box<Integer> boxing = boxing(100);
        System.out.println(boxing.content);
    }

    // <T> 가 메소드 return 앞에 표현
    // Parameter 로 T 타입의 객체를 받는다.
    // Box<T> 객체를 return
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.content = t;
        return box;
    }

    public static <T extends Number> boolean compare(T t1, T t2) {
        return t1.doubleValue() == t2.doubleValue();
    }
}
