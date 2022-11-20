import java.util.List;
import java.util.UUID;

public interface ProductService {

    public List<Product> getProductsByProductGroup(String productGroup);
    public boolean saveProduct(Product product);
    public void getProducts();

    public Product deleteProduct(UUID id);
    public Product getProductById(UUID id);
    public List<Product> getProductsByBrand(String brand);

}
