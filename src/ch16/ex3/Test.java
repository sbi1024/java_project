package ch16.ex3;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.action((x, y) -> {
            return x + y;
        });

        person.action((x, y) -> x + y);
    }

    public static int div(int x, int y) {
        return x / y;
    }
}
