package com.workintech.composition.model;

public class Bed {
    private String style;
    private int pillow;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillow, int height, int sheets, int quilt) {
        this.style = style;
        this.pillow = pillow;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public int getPillow() {
        return pillow;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public void make(){
        System.out.println("The bed is being made.");
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("\n" + "Style: " + style + "\n");
        build.append("Pillow: " + pillow + "\n");
        build.append("Sheets: " + sheets + "\n");
        build.append("Quilt: " + quilt + "\n");
        return build.toString();
        //return  "style: " + style + ", pillow: " + pillow + ", height: " + height + ", sheets: " + sheets + ", quilt: " + quilt;
    }
}
