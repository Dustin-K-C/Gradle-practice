package dice;

import java.util.Random;

public class Dice {
    public int roll(int sides) {
        if (sides <= 0) {
            throw new IllegalArgumentException("Number of sides must be greater than 0");
        }
        Random random = new Random();
        return random.nextInt(sides) + 1;
    }
}

