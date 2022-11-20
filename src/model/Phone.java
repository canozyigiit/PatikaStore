package model;

import model.Brand;

import java.util.UUID;

public class Phone extends Product {

    private static final String productGroup = "PHONE";
    private int memoryInformation;
    private int screenSize;
    private int batteryPower;
    private int ram;
    private Color color;



    public Phone(UUID id, int unitPrice, int discountRate, int stock, String name, Brand brand, int memoryInformation, int screenSize, int batteryPower, int ram, Color color) {
        super(id,unitPrice,discountRate,stock,name,brand,productGroup);
        this.memoryInformation = memoryInformation;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;

    }


    public int getMemoryInformation() {
        return memoryInformation;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public int getRam() {
        return ram;
    }

    public Color getColor() {
        return color;
    }

}
