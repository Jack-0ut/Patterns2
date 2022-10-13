package org.example.abstract_factory;

public abstract class CharacterRace {
    protected String name;
    protected int health;
    protected Stats bonuses;

    public CharacterRace(Stats bonuses) {
        this.bonuses = bonuses;
    }

    public  void print(){
        System.out.println("Race: " + name + "\nHealth: " + health);
        System.out.println("\t\tBonuses");
        bonuses.print();

    }

    public abstract void  sayTHM();


    public Stats getBonuses() {
        return bonuses;
    }

}
