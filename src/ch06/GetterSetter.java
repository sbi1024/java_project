package ch06;

public class GetterSetter {
    private int n = 10;

    void m() {
        System.out.println(n);
        System.out.println("GetterSetter n : " + n);
    }

//    public void setN(int n) {
//        // 조건 체크..분기..값을 조정... 추가될 수 있다.
//        this.n = n;
//    }
//
//    public int getN() {
//        return this.n;
//    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
