package patterns.strategy;

public class Calculator {
    private ISumStrategy strategy;

    public Calculator(ISumStrategy strategy) {
        this.strategy = strategy;
    }

    public double run(int N) {
        return Math.log(strategy.sum(N));
    }
}
