package ch07.abst;

public class Test {
    public static void main(String[] args) {
        MyMouseAdaptor adaptor = new MyMouseAdaptor();
        adaptor.click();
        adaptor.over();

        YourMouseAdaptor adaptor1 = new YourMouseAdaptor();
        adaptor1.click();
        adaptor1.over();
    }
}
