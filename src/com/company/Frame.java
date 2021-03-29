package com.company;

public class Frame {
    private String theme;
    private String material;
    private String manufacturer;
    private Dimensions dimensions;

    public Frame(String theme, String material, String manufacturer, Dimensions dimensions) {
        this.theme = theme;
        this.material = material;
        this.manufacturer = manufacturer;
        this.dimensions = dimensions;
    }

    public String getTheme() {
        return theme;
    }

    public String getMaterial() {
        return material;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }


}
