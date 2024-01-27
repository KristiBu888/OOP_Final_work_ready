package Heroes;

import TypesOfHero.Archer;

public class Crossbowman extends Archer {

    public Crossbowman(String name, int x, int y) {
        super(name,
                75,
                75,
                15,
                15,
                new int[] { 10, 15 },
                x,
                y,
                3,
                30,
                30,
                7,
                10,
                2);
    }

    @Override
    public String getType() {
        return "CrossBowMan";
    }

    @Override
    public String toString() {
        return "CrossBowMan" + super.toString();
    }
}
