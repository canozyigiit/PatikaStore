import model.Brand;
import model.Notebook;
import model.Phone;
import service.BrandService;
import service.BrandServiceImpl;
import service.ProductService;
import service.ProductServiceImpl;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {



        BrandService brandService = new BrandServiceImpl();

        brandService.saveBrand(new Brand(UUID.randomUUID(),"Samsung"));
        brandService.saveBrand(new Brand(UUID.randomUUID(),"Lenovo"));
        brandService.saveBrand(new Brand(UUID.randomUUID(),"Apple"));
        brandService.saveBrand(new Brand(UUID.randomUUID(),"Huawei"));
        brandService.saveBrand(new Brand(UUID.randomUUID(),"Casper"));
        brandService.saveBrand(new Brand(UUID.randomUUID(),"Asus"));
        brandService.saveBrand(new Brand(UUID.randomUUID(),"HP"));
        brandService.saveBrand(new Brand(UUID.randomUUID(),"Xiaomi"));
        brandService.saveBrand(new Brand(UUID.randomUUID(),"Monster"));



        ProductService productService = new ProductServiceImpl();

        Phone phone = new Phone(UUID.randomUUID(),15000,0,10,"Samsung Galaxy S20",brandService.getBrandByName("Samsung"),16,14,3000,16,Color.BLACK);
        Notebook notebook = new Notebook(UUID.randomUUID(),30000,0,5,"Macbook",brandService.getBrandByName("Apple"),16,13,250);

        productService.saveProduct(phone);
        productService.saveProduct(notebook);

        System.out.println("*******************************************************");
        productService.getProducts();
        System.out.println("*******************************************************");
        productService.getProductsByProductGroup("PHONE").forEach(x -> {
            System.out.println(x.getId()+" "+x.getName());
        });
        System.out.println("*******************************************************");

        productService.getProductsByProductGroup("NOTEBOOK").forEach(x -> {
            System.out.println(x.getId()+" "+x.getName());
        });
        System.out.println("*******************************************************");

        productService.getProductsByBrand("Samsung").forEach(x -> {
            System.out.println(x.getId() +" "+ x.getName() +" "+ x.getProductGroup());
        });
        System.out.println("*******************************************************");

        brandService.getBrands().forEach(x -> {
            System.out.println(x.getName());
        });
        System.out.println("*******************************************************");


    }

}
