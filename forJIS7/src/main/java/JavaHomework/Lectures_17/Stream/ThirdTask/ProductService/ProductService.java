package JavaHomework.Lectures_17.Stream.ThirdTask.ProductService;

import JavaHomework.Lectures_17.Stream.ThirdTask.Model.Product;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static JavaHomework.Lectures_17.Stream.ThirdTask.Repository.ProductRepository.*;

public class ProductService implements Service {

    @Override
    public List<Product> fiendProduct() {
        List<Product> discountValue = productList.stream()         //тут как-то
                .filter(discount -> discount.getDiscount() >= 30)  //записал
                .collect(Collectors.toList());                     //в переменную
        System.out.println(discountValue);
        return discountValue;
    }

    @Override
    public List<Product> maxProductPrice() {
        productList.stream()                                   //как это
                .max(Comparator.comparing(Product::getPrice))  //записать
                .ifPresent(System.out::println);               //в переменную
        return null;
    }

    @Override
    public List<Product> minProductPrice() {
        productList.stream()                                   //как это
                .min(Comparator.comparing(Product::getPrice))  //записать
                .ifPresent(System.out::println);               //в переменную
        return null;
    }
}
