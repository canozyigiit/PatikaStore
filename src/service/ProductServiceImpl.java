import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService{

    public static List<Product> products = new ArrayList<>();

    @Override
    public List<Product> getProductsByProductGroup(String productGroup) {
        return products.stream()
                .filter(x-> x.getProductGroup() == productGroup)
                .collect(Collectors.toList());
    }

    @Override
    public boolean saveProduct(Product product) {
        return products.add(product);
    }

    @Override
    public void getProducts() {

        products.forEach(x -> {
            System.out.println("Ürün Adı : " + x.getName() + " ,Marka : " + x.getBrand().getName() + " ,Stok : " + x.getStock()
                    + " ,Birim Fiyatı : " + x.getUnitPrice() + " ,İndirim Oranı : " + x.getDiscountRate()
            );
        });
    }

    @Override
    public Product deleteProduct(UUID id) {
        Product product = products.stream()
                .filter(x-> x.getId() == id).findFirst().get();
        int index = products.indexOf(product);
        return products.remove(index);
    }

    @Override
    public Product getProductById(UUID id) {
        return  products.stream()
                .filter(x-> x.getId() == id).findFirst().get();
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return products.stream()
                .filter(x-> x.getBrand().getName() == brand).collect(Collectors.toList());
    }
}
