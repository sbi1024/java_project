package ch07.abst;

// 추상 클래스는 상속 관련해서 객체 생성의 목적이 아닌 구조상 필요하고 추상적인 틀을 제공
public class MyMouseAdaptor extends MouseAdaptor {
    @Override
    public void over() {
        System.out.println("MyMouseAdaptor.over");
    }

    @Override
    public void out() {
        System.out.println("MyMouseAdaptor.out");
    }
}
