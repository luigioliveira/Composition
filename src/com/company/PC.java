package com.company;

public class PC {
    private Case theCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public PC(Case theCase, Motherboard motherboard, Monitor monitor) {
        this.theCase = theCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt(45, 50, "black");
    }

    private Case getCase() {
        return theCase;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }

    private Monitor getMonitor() {
        return monitor;
    }
}
