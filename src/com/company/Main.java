package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("Dell Inc.", "Collonade", "500W", dimensions);

        Monitor theMonitor = new Monitor("SC200", "LG Inc.", 100, new Resolution(1920, 1080));
        Motherboard motherboard = new Motherboard("A320M", "Acer", 1, 1, "V1.1");

        PC computer = new PC(theCase, motherboard, theMonitor);

        Bed bed = new Bed("Bed Frame", "Twin", true, false, "220 pounds", new Dimensions(35.8, 34.8, 77.2), 1);
        Frame frame = new Frame("Nature", "Plastic", "Acme", new Dimensions(20,13));
        Wardrobe wardrobe = new Wardrobe("Modern", "Mystic White", 2, true, new Dimensions(81.3, 165.1, 50.8));

        Bedroom bedroom = new Bedroom(2, 1, bed, frame, wardrobe);

        System.out.println("Number of doors: " + bedroom.getDoors());
        System.out.println("Number of windows: " + bedroom.getWindows());
        System.out.println("Type of bed: " + bedroom.getBeds().getType());
        System.out.println("Bed's weight capacity: " + bedroom.getBeds().getWeightCapacity());
        System.out.println("Frame's theme: " + bedroom.getFrames().getTheme());
        System.out.println("Frame's material: " + bedroom.getFrames().getMaterial());
        System.out.println("Bedroom's dimensions (width): " + bedroom.getFrames().getDimensions().getWidth());
        System.out.println("Bedroom's dimensions (height): " + bedroom.getFrames().getDimensions().getHeight());
        System.out.println("Wardrobe's style: " + bedroom.getWardrobes().getStyle());
        System.out.println("Wardrobe's color: " + bedroom.getWardrobes().getColor());
        System.out.println("Wardrobe's doors: " + bedroom.getWardrobes().getDoors());
        System.out.println("Wardrobe's dimensions (width): " + bedroom.getWardrobes().getDimensions().getWidth());
        System.out.println("Wardrobe's dimensions (height): " + bedroom.getWardrobes().getDimensions().getHeight());




    }
}
