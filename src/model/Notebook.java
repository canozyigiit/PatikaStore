package model;

import model.Brand;

import java.util.UUID;

public class Notebook extends Product {

    private static final String productGroup = "NOTEBOOK";
    private int ram;
    private int screenSize;
    private int storage;

    public Notebook(UUID id, int unitPrice, int discountRate, int stock, String name, Brand brand, int ram, int screenSize, int storage) {
        super(id,unitPrice,discountRate,stock,name,brand,productGroup);
        this.ram = ram;
        this.screenSize = screenSize;
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int getStorage() {
        return storage;
    }
}
