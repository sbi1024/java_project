package ch07;

public class Child extends Parents {

    public Child() {
        super(1);
    }

    int n = 20;

    public void m() {
        System.out.println(n);
        System.out.println(this.n);
        System.out.println(super.n);
    }
}
