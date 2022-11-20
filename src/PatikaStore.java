import model.Brand;
import model.Color;
import model.Notebook;
import model.Phone;
import service.BrandService;
import service.BrandServiceImpl;
import service.ProductService;
import service.ProductServiceImpl;

import java.util.UUID;

public class PatikaStore {

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

        Phone phone = new Phone(UUID.randomUUID(),15000,0,10,"Samsung Galaxy S20",brandService.getBrandByName("Samsung"),16,14,3000,16, Color.BLACK);
        Notebook notebook = new Notebook(UUID.randomUUID(),30000,0,5,"Macbook",brandService.getBrandByName("Apple"),16,13,250);

        productService.saveProduct(phone,"PHONE");
        productService.saveProduct(notebook,"NOTEBOOK");

        System.out.println("\n-- TÜM ÜRÜNLER --\n");

        productService.getProducts();

        System.out.println("\n-- TELEFONLAR --\n");

        productService.getProductsByProductGroup("PHONE");

        System.out.println("\n-- NOTEBOOK'LAR --\n");

        productService.getProductsByProductGroup("NOTEBOOK");

        System.out.println("\n-- SAMSUNG MARKASINA AİT ÜRÜNLER -- \n");

        productService.getProductsByBrand("Samsung").forEach(x -> {
            System.out.println( "ID : " + x.getId() + " ,Ürün Adı : "+ x.getName() +" ,Ürün grubu : "+ x.getProductGroup());
        });
        System.out.println("\n-- APPLE MARKASINA AİT ÜRÜNLER -- \n");

        productService.getProductsByBrand("Apple").forEach(x -> {
            System.out.println( "ID : " + x.getId() + " ,Ürün Adı : "+ x.getName() +" ,Ürün grubu : "+ x.getProductGroup());
        });
        System.out.println("\n-- MARKALAR --\n");


        brandService.getBrands().forEach(x -> {
            System.out.println(x.getName());
        });


    }

}
