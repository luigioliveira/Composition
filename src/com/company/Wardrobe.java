package com.company;

public class Wardrobe {
    private String style; // contemporary
    private String color;
    private int doors;
    private boolean isAssemblyRequired;
    private Dimensions dimensions;

    public Wardrobe(String style, String color, int doors, boolean isAssemblyRequired, Dimensions dimensions) {
        this.style = style;
        this.color = color;
        this.doors = doors;
        this.isAssemblyRequired = isAssemblyRequired;
        this.dimensions = dimensions;
    }

    public String getStyle() {
        return style;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isAssemblyRequired() {
        return isAssemblyRequired;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
