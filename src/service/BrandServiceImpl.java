import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BrandServiceImpl implements BrandService{


    public static List<Brand> brands = new ArrayList<>();

    @Override
    public boolean saveBrand(Brand brand) {
        return brands.add(brand);
    }

    @Override
    public List<Brand> getBrands() {
        return brands.stream()
                .sorted(Comparator.comparing(Brand::getName))
                .collect(Collectors.toList());
    }

    @Override
    public Brand getBrandByName(String name) {
        return brands.stream()
                .filter(x-> x.getName() == name).findFirst().get();
    }
}
