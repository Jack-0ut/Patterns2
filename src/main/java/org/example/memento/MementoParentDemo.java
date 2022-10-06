package org.example.memento;

import java.util.Scanner;

public class MementoParentDemo {
    public static void main(String[] args) {
        System.out.println("Creating character");
        Character character = new Character("Super Mario","Small Person");
        Stats generatedStats = Stats.generate();
        character.setAttributes(generatedStats);
        character.printSheet();

        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        System.out.println("Generate stats 2 times and save it");

        generatedStats = Stats.generate();
        generatedStats.print();
        originator.setState(generatedStats);
        careTaker.add(originator.saveStateToMemento());

        generatedStats = Stats.generate();
        generatedStats.print();
        originator.setState(generatedStats);
        careTaker.add(originator.saveStateToMemento());


        System.out.println("Load 2 generated stats");

        originator.getStateFromMemento(careTaker.get(0));
        generatedStats = originator.getState();
        generatedStats.print();

        originator.getStateFromMemento(careTaker.get(1));
        generatedStats = originator.getState();
        generatedStats.print();


    }
}
