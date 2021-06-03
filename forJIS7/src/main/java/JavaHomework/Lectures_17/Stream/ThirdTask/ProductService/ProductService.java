package JavaHomework.Lectures_17.Stream.ThirdTask.ProductService;

import JavaHomework.Lectures_17.Stream.ThirdTask.Model.Product;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static JavaHomework.Lectures_17.Stream.ThirdTask.Repository.ProductRepository.*;

public class ProductService implements Service {

    @Override
    public List<Product> fiendProduct() {
        var discountValue = productList.stream()
                .filter(it -> it.getDiscount() >= 30)
                .collect(Collectors.toList());
        return discountValue;
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
