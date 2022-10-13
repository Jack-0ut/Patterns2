package org.example.factory;

import org.example.factory.Dice;
import java.util.HashMap;

public class Stats {
    private HashMap<String,Integer> stats = new HashMap<>();
    public Stats(int strength, int dexterity, int constitution, int intellect, int wisdom, int charisma) {
        stats.put("Strength",strength);
        stats.put("Dexterity",dexterity);
        stats.put("Constitution",constitution);
        stats.put("Intellect",intellect);
        stats.put("Wisdom",wisdom);
        stats.put("Charisma",charisma);

        System.out.println("\tAttributes\n" + "Strength: " + strength + "\nDexterity: " + dexterity +
                "\nConstitution: " + constitution + "\nIntellect: " + intellect +
                "\nWisdom: " + wisdom + "\nCharisma: " + charisma);

    }

    public static Stats generate(){
        return new Stats(Dice.rollStat(), Dice.rollStat(),Dice.rollStat(),
                Dice.rollStat(), Dice.rollStat(), Dice.rollStat());

    }

    public HashMap<String, Integer> getStats() {
        return stats;
    }

    public void setStats(HashMap<String, Integer> stats) {
        this.stats = stats;
    }


}
