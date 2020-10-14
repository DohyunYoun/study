package patterns.strategy;

public class GaussSumStrategy implements ISumStrategy {
    @Override
    public long sum(long N) {
        return (N + 1) * N / 2;
    }
}
