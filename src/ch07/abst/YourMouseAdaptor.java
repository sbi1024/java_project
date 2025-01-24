package ch07.abst;

public class YourMouseAdaptor extends MouseAdaptor {
    @Override
    public void over() {
        System.out.println("YourMouseAdaptor.over");
    }

    @Override
    public void out() {
        System.out.println("YourMouseAdaptor.out");
    }

    @Override
    public void click() {
        System.out.println("YourMouseAdaptor.click");
    }
}
