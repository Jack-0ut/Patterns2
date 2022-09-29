package org.example.memento;

public class Stats {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intellect;
    private int wisdom;
    private int charisma;

    private Stats state;
    public Stats(int strength, int dexterity, int constitution, int intellect, int wisdom, int charisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }
    public Stats(Stats state){
        this.state = state;
    }
    public static Stats generate(){
        return new Stats(Dice.rollStat(),Dice.rollStat(),Dice.rollStat(),
                Dice.rollStat(),Dice.rollStat(),Dice.rollStat());
    }
    public void print(){
        System.out.println("\tAttributes\n" + "Strength: " + strength + "\nDexterity: " + dexterity +
                            "\nConstitution: " + constitution + "\nIntellect: " + intellect +
                            "\nWisdom: " + wisdom + "\nCharisma: " + charisma);
    }
}
