package ch07.abst;

public abstract class MouseAdaptor {
    public void click() {
        System.out.println("click");
    }

    public void dblclick() {
        System.out.println("double click");
    }

    public abstract void over();
    public abstract void out();
}
