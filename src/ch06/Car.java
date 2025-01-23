package ch06;

public class Car {
    String name;
    int speed;

    // 생성자 없는 경우
    // 컴파일러가 기본생성자를 추가
    // public Car(int speed) {
    //   this.speed = speed;
//    }

    // 생성자 여러개 overloading
    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    // this() 활용
    public Car(int speed) {
        this("아반떼", speed);
    }

    // 메소드 추가
    public void drive() {
        System.out.println(name + " 가 " + speed + " 로 달린다. ");
    }

    public String getDriveInfo() {
        return this.name + " 가 " + this.speed + " 로 달린다. ";
    }

    public String getDriveInfo(String road) {
        return road + " 도로를 " + this.name + " 가 " + this.speed + " 로 달린다.";
    }
}
