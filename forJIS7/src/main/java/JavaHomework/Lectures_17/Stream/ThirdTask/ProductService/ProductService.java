package JavaHomework.Lectures_17.Stream.ThirdTask.ProductService;

import JavaHomework.Lectures_17.Stream.ThirdTask.Model.Product;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static JavaHomework.Lectures_17.Stream.ThirdTask.Repository.ProductRepository.*;

public class ProductService implements Service {

    @Override
    public List<Product> findProductByDiscount() {
        var discountedProducts = productList.stream()
                .filter(it -> it.getDiscount() >= 30)
                .collect(Collectors.toList());
        return discountedProducts;
    }

    public List<Product>findProductByPrice(){
        List<Product> products = findProductByDiscount().stream()
                .filter(product -> product.getPrice() <= 10.5)
                .collect(Collectors.toList());
        return products;
    }

    @Override
    public Product maxProductPrice() {
        var maxProduct = productList.stream()
                .max(Comparator.comparing(Product::getPrice));
        if (maxProduct.isPresent()) {
            return maxProduct.get();
        } else return null;
    }

    @Override
    public Product minProductPrice() {
        var minProduct = productList.stream()
                .min(Comparator.comparing(Product::getPrice));
        if (minProduct.isPresent()) {
            return minProduct.get();
        }else return null;
    }
}
