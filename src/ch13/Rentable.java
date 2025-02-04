package ch13;

// 뭔가 기능을 빌려주는 기능을 표현
// 뭔가의 타입을 여러개로 표현
public interface Rentable<P> {
    P rent();
}
