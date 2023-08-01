package com.workintech.composition.model;

public class Wall {
    private String direction;
    //direction enum olabilirdi.

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
    public void create(){
        System.out.println(direction);
    }

    @Override
    public String toString() {
        return '\n' + "Direction:'" + direction + '\n';
    }
}
