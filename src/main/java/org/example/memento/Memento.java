package org.example.memento;

public class Memento {
    private Stats state;
    public Memento(){};
    public Memento(Stats state) {
        this.state = state;
    }

    public Stats getState() {
        return state;
    }

    public void setState(Stats state) {
        this.state = state;
    }


}
