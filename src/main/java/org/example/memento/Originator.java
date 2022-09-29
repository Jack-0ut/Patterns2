package org.example.memento;

public class Originator {
    public Stats state;

    public Stats getState() {
        return state;
    }

    public void setState(Stats state) {
        this.state = state;
    }
    public Memento saveStateToMemento(){
        return  new Memento(state);
    }
    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
