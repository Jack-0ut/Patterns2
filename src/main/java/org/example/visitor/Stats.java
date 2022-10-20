package org.example.visitor;

import java.util.HashMap;
import java.util.Set;

/** Class that defines 6 Attributes for every Character
 * Using Dice class to generate Stats and save it to the HashMap with key 'Attribute Name'
 **/
public class Stats implements DataElement{
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

    // Print 6 stats on the screen
    public void print(){
        Set<String> attributesSet = stats.keySet();
        System.out.println("#################################################################");
        for(String e : attributesSet){
            System.out.println(e + ": " + stats.get(e));
        }
        System.out.println("#################################################################");
    }

    // For visitor pattern
    @Override
    public void accept() {
        System.out.println("\t\tAttributes");
        this.print();
    }
}
