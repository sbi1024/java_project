package ch07.methodpoly;

import java.util.Objects;

public class MyClass {
    int n;
    String str;

    @Override
    public String toString() {
        return "MyClass{" +
                "n=" + n +
                ", str='" + str + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return n == myClass.n && Objects.equals(str, myClass.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(n, str);
    }
}
