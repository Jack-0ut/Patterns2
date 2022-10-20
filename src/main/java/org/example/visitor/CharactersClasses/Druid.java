package org.example.visitor.CharactersClasses;

import java.util.ArrayList;
import java.util.List;

public class Druid extends CharacterClass {
    private List<String> magics;

    public Druid() {
        this.magics = new ArrayList<>();
        this.name = "Druid";
        this.hp = 8;
        magics.add("Healing Wound");
        magics.add("Animal Shape");
    }

    @Override
    public void printMagika() {
        System.out.println(this.name + " could do magic:" );
        for(String magic :magics){
            System.out.println(magic);
        }
    }
}
