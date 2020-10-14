package patterns.observer;

public class EvenBettingPlayer extends Player {
    public EvenBettingPlayer(String name) {
        super(name);
    }

    @Override
    public void update(int n) {
        if (n % 2 == 0) {
            System.out.println(getName() + " win!");
        }
    }
}