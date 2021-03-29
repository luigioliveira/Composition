package com.company;

public class Bed {
    private String type; // BedFrame.
    private String bedSize; // TwinSize
    private boolean isAssemblyRequired; // Yes/No
    private boolean isMattressIncluded; //Yes/No
    private String weightCapacity; // 100kg.
    private Dimensions dimensions;
    private int sellersWarranty; // 1 (year)

    public Bed(String type, String bedSize, boolean isAssemblyRequired, boolean isMattressIncluded, String weightCapacity, Dimensions dimensions, int sellersWarranty) {
        this.type = type;
        this.bedSize = bedSize;
        this.isAssemblyRequired = isAssemblyRequired;
        this.isMattressIncluded = isMattressIncluded;
        this.weightCapacity = weightCapacity;
        this.dimensions = dimensions;
        this.sellersWarranty = sellersWarranty;
    }

    public void seeDetails() {
        System.out.println("Access bestbuy.com .");
    }

    public String getType() {
        return type;
    }

    public String getBedSize() {
        return bedSize;
    }

    public boolean isAssemblyRequired() {
        return isAssemblyRequired;
    }

    public boolean isMattressIncluded() {
        return isMattressIncluded;
    }

    public String getWeightCapacity() {
        return weightCapacity;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getSellersWarranty() {
        return sellersWarranty;
    }
}
