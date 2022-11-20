import java.util.UUID;

public abstract class Product{

    private UUID id;
    private int unitPrice;
    private int discountRate;
    private int stock;
    private String name;
    private Brand brand;
    private String productGroup;

    public UUID getId() {
        return id;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public int getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public Product(UUID id, int unitPrice, int discountRate, int stock, String name, Brand brand, String productGroup) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stock = stock;
        this.name = name;
        this.brand = brand;
        this.productGroup = productGroup;
    }
}
