package com.workintech.composition.model;

import com.workintech.composition.enums.PaintColor;

public class Ceiling {
    private int height;
    private PaintColor paintedColor;

    public Ceiling(int height, PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintedColor() {
        return paintedColor;
    }
    public void create(){

        System.out.println("Height: " + height + " Painted Color: " + paintedColor);
    }

@Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("\n" + "Height: " + height + "\n");
        build.append("Painted Color: " + paintedColor + "\n");
        return build.toString();
        //return "height: " + height + ", paintedColor: " + paintedColor;
    }
}
