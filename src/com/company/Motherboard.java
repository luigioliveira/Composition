package com.company;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardsSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardsSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardsSlots = cardsSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("The software " + programName + " is now loading!");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardsSlots() {
        return cardsSlots;
    }

    public String getBios() {
        return bios;
    }
}
