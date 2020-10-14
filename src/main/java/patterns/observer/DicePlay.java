package patterns.observer;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class DicePlay {
    private final LinkedList<Player> players = new LinkedList<Player>();
    private final Random random = new Random();

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void play() {
        int v = random.nextInt(6) + 1;

        System.out.println("Dice Number: " + v);

        for (Player player : players) {
            player.update(v);
        }
    }
}
