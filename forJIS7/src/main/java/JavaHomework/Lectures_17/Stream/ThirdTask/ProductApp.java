package JavaHomework.Lectures_17.Stream.ThirdTask;

import JavaHomework.Lectures_17.Stream.ThirdTask.Model.Product;
import JavaHomework.Lectures_17.Stream.ThirdTask.ProductService.*;

import static JavaHomework.Lectures_17.Stream.ThirdTask.Repository.ProductRepository.*;

public class ProductApp {

    public static void main(String[] args) {

        productList.add(new Product("Milk", 25.99, 45));
        productList.add(new Product("Coffee", 15.99,0));
        productList.add(new Product("Tee", 2.99,0));
        productList.add(new Product("Bread",8.99,50));
        productList.add(new Product("Beer", 1.99,10));
        productList.add(new Product("Potato",0.99,5));

        var productService = new ProductService();

        System.out.println(productService.findProductByDiscount());
        System.out.println(productService.minProductPrice());
        System.out.println(productService.maxProductPrice());
        System.out.println(productService.findProductByPrice());
        System.out.println(productService.findProductWithoutDiscount());
        System.out.println(productService.maxProductPrice());

    }
}
