package JavaHomework.Lectures_17.Stream.ThirdTask.ProductService;

import JavaHomework.Lectures_17.Stream.ThirdTask.Model.Product;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static JavaHomework.Lectures_17.Stream.ThirdTask.Repository.ProductRepository.*;

public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> findProductByDiscount() {
        return productList.stream()
                .filter(it -> it.getDiscount() >= 30)
                .collect(Collectors.toList());
    }

    public List<Product> findProductByPrice() {
        return findProductByDiscount().stream()
                .filter(product -> product.getPrice() <= 10.5)
                .collect(Collectors.toList());
    }

    @Override
    public Product maxProductPrice() {
        var maxProduct = findProductWithoutDiscount().stream()
                .max(Comparator.comparing(Product::getPrice));
        if (maxProduct.isPresent()) {
            return maxProduct.get();
        } else return null;
    }

    public List<Product> findProductWithoutDiscount() {
        return productList.stream()
                .filter(product -> product.getDiscount() == 0)
                .collect(Collectors.toList());
    }

    @Override
    public Product minProductPrice() {
        var minProduct = productList.stream()
                .min(Comparator.comparing(Product::getPrice));
        if (minProduct.isPresent()) {
            return minProduct.get();
        } else return null;
    }
}
