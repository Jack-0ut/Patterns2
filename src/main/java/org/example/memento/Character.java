package org.example.memento;

public class Character {
    private String name;
    private String dndclass;
    private Stats attributes;

    public Character(String name, String dndclass) {
        this.name = name;
        this.dndclass = dndclass;
    }

    public void printSheet(){
        System.out.println("Name: " + name + "\nDnD Class: " + dndclass);
        attributes.print();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDndclass() {
        return dndclass;
    }

    public void setDndclass(String dndclass) {
        this.dndclass = dndclass;
    }

    public Stats getAttributes() {
        return attributes;
    }

    public void setAttributes(Stats attributes) {
        this.attributes = attributes;
    }
}
