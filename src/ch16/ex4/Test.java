package ch16.ex4;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.action((x, y) -> {
            return Computer.staticMethod(x, y);
        });

        person.action((x, y) -> Computer.staticMethod(x, y));

        person.action(Computer::staticMethod);
    }
}
