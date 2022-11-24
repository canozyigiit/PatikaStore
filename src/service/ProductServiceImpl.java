package service;

import model.Brand;
import model.Notebook;
import model.Phone;
import model.Product;
import service.ProductService;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductServiceImpl implements ProductService {

    public static List<Product> products = new ArrayList<>();
    public static List<Phone> phones = new ArrayList<>();
    public static List<Notebook> notebooks = new ArrayList<>();


    @Override
    public void getProductsByProductGroup(String productGroup) {
        Formatter fmt = new Formatter();
        if (productGroup.equals("PHONE")){
            fmt.format( "%15s  %12s  %12s   %12s   %12s   %12s   %8s   %8s  %8s  %8s  %8s  \n", "|Ürün Adı| ", "|Marka|", "|Stok|", "|Birim Fiyatı|","|İndirim Oranı|","|Ürün Kategorisi|","|Renk|","|Ram|","|Ekran Boyutu|","|Pil Gücü|","|Hafıza Bilgisi|");
            phones.stream()
                    .filter(x-> x.getProductGroup() == productGroup)
                    .collect(Collectors.toList())
                    .forEach(x -> {
                        fmt.format("%1s  %10s  %12s   %12s   %12s   %12s   %16s   %9s  %12s  %12s  %12s  \n",  x.getName(), x.getBrand().getName(), x.getStock(), x.getUnitPrice(),
                                x.getDiscountRate(), x.getProductGroup(), x.getColor(), x.getRam(),
                                x.getScreenSize(), x.getBatteryPower(), x.getMemoryInformation());


                    });
            System.out.println(fmt);

        }else if(productGroup.equals("NOTEBOOK")){
            fmt.format("%5s  %7s  %12s   %12s   %12s   %12s   %8s   %8s  %8s\n", "|Ürün Adı| ", "|Marka|", "|Stok|", "|Birim Fiyatı|","|İndirim Oranı|","|Ürün Kategorisi|","|Hafıza|","|Ram|","|Ekran Boyutu|");
            notebooks.stream()
                    .filter(x-> x.getProductGroup() == productGroup)
                    .collect(Collectors.toList())
                    .forEach(x -> {
                        fmt.format("%1s  %10s  %12s   %8s   %17s   %14s   %15s   %9s  %12s\n",  x.getName(), x.getBrand().getName(), x.getStock(), x.getUnitPrice(),
                                x.getDiscountRate(), x.getProductGroup(), x.getStorage(), x.getRam(),
                                x.getScreenSize());

                    });
            System.out.println(fmt);

        }

    }



    @Override
    public boolean saveProduct(Product product,String productGroup) {
        if (productGroup.equals("PHONE"))
            phones.add((Phone) product);
        else
            notebooks.add((Notebook) product);
        return products.add(product);
    }

    @Override
    public void getProducts() {
        Formatter fmt = new Formatter();
        fmt.format("%17s %17s %17s %17s %17s %17s\n", "|Ürün Adı| ", "|Marka|", "|Stok|", "|Birim Fiyatı|","|İndirim Oranı|","|Ürün Kategorisi|");

        products.forEach(x -> {
            fmt.format("%17s %17s %15s %15s %15s %15s \n",  x.getName(), x.getBrand().getName(), x.getStock(), x.getUnitPrice(),
                    x.getDiscountRate(), x.getProductGroup());
                });
        System.out.println(fmt);


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
