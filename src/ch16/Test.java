package ch16;

public class Test {
    public static void main(String[] args) {
        CalculableImplPlus calculableImplPlus = new CalculableImplPlus();
        calculableImplPlus.calculate(10, 20);

        CalculableImplMinus calculableImplMinus = new CalculableImplMinus();
        calculableImplMinus.calculate(10, 20);
    }

    public static void action(Calculable calculable) {
        calculable.calculate(0, 0);
    }
}
