package patterns.strategy;

public class SimpleSumStrategy implements ISumStrategy{
    @Override
    public long sum(long N) {
        long sum = N;

        for(long i=1; i<N; i++) {
            sum += i;
        }

        return sum;
    }
}
