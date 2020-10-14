package patterns.strategy;

public class Main {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator(new SimpleSumStrategy());
        Calculator cal2 = new Calculator(new GaussSumStrategy());

        double result1 = cal1.run(10000000);
        double result2 = cal2.run(10000000);
    }
}
