package patterns.observer;

public class Main {
    public static void main(String[] args) {
        DicePlay dicePlay = new DicePlay();

        Player player1 = new EvenBettingPlayer("Jane");
        Player player2 = new OddBettingPlayer("Suji");

        dicePlay.addPlayer(player1);
        dicePlay.addPlayer(player2);

        for (int i = 0; i < 10; i++) {
            dicePlay.play();
            System.out.println();
        }
    }
}
