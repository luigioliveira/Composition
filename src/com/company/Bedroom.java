package com.company;

public class Bedroom {
    private int doors;
    private int windows;
    private Bed beds;
    private Frame frames;
    private Wardrobe wardrobes;

    public Bedroom(int doors, int windows, Bed beds, Frame frames, Wardrobe wardrobes) {
        this.doors = doors;
        this.windows = windows;
        this.beds = beds;
        this.frames = frames;
        this.wardrobes = wardrobes;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public Bed getBeds() {
        return beds;
    }

    public Frame getFrames() {
        return frames;
    }

    public Wardrobe getWardrobes() {
        return wardrobes;
    }
}
