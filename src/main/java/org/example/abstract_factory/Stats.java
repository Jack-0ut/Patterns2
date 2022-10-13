package org.example.abstract_factory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Stats {
    private HashMap<String,Integer> stats = new HashMap<>();
    public Stats(int strength, int dexterity, int constitution, int intellect, int wisdom, int charisma) {
        stats.put("Strength",strength);
        stats.put("Dexterity",dexterity);
        stats.put("Constitution",constitution);
        stats.put("Intellect",intellect);
        stats.put("Wisdom",wisdom);
        stats.put("Charisma",charisma);
    }

    public static Stats generate(){
        return new Stats(Dice.rollStat(), Dice.rollStat(), Dice.rollStat(),
                Dice.rollStat(), Dice.rollStat(), Dice.rollStat());

    }

    public HashMap<String, Integer> getStats() {
        return stats;
    }

    public void setStats(HashMap<String, Integer> stats) {
        this.stats = stats;
    }

    public void print(){
        Set<String> attributesSet = stats.keySet();

        System.out.println("#################################################################");
        for(String e : attributesSet){
            System.out.println(e + ": " + stats.get(e));
        }
        System.out.println("#################################################################");
    }
}
