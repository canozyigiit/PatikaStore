package service;

import model.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    public void getProductsByProductGroup(String productGroup);
    public boolean saveProduct(Product product,String productGroup);
    public void getProducts();

    public Product deleteProduct(UUID id);
    public Product getProductById(UUID id);
    public List<Product> getProductsByBrand(String brand);

}
