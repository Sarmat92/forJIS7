package JavaHomework.Lectures_17.Stream.ThirdTask;

import JavaHomework.Lectures_17.Stream.ThirdTask.ProductService.*;
import JavaHomework.Lectures_17.Stream.ThirdTask.Repository.ProductRepository;

public class ProductApp {

    public static void main(String[] args) {

        ProductRepository.initializeProductList();

        var productService = new ProductServiceImpl();

        System.out.println(productService.findProductByDiscount());
        System.out.println(productService.minProductPrice());
        System.out.println(productService.maxProductPrice());
        System.out.println(productService.findProductByPrice());
        System.out.println(productService.findProductWithoutDiscount());
        System.out.println(productService.maxProductPrice());

    }
}
