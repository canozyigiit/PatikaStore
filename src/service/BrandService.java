package service;

import model.Brand;

import java.util.List;

public interface BrandService {

    public boolean saveBrand(Brand brand);
    public List<Brand> getBrands();
    public Brand getBrandByName(String name);
}
