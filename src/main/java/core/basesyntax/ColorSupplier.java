package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public static Color getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index];
    }
}
