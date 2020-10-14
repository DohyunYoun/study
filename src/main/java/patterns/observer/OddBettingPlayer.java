package patterns.observer;

public class OddBettingPlayer extends Player {
    public OddBettingPlayer(String name) {
        super(name);
    }

    @Override
    public void update(int n) {
        if (n % 2 == 1) {
            System.out.println(getName() + " win!");
        }
    }
}