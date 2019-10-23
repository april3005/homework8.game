package players;

import java.util.Random;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, Ability.BOOST);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        for (int i = 0; i <heroes.length ; i++) {
            Random r = new Random(2);
            int randomNumber= r.nextInt(15);
            heroes[i].setDamage(getDamage()+randomNumber);
    }
}}
