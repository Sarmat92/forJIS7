package JavaHomework.Lectures_17.Stream.ThirdTask;

import JavaHomework.Lectures_17.Stream.ThirdTask.Model.Product;
import JavaHomework.Lectures_17.Stream.ThirdTask.ProductService.*;

import static JavaHomework.Lectures_17.Stream.ThirdTask.Repository.ProductRepository.*;

public class ProductApp {

    public static void main(String[] args) {

        productList.add(new Product("Milk", 25, 10));
        productList.add(new Product("Coffee", 15,5));
        productList.add(new Product("Tee", 2,1));
        productList.add(new Product("Bread",8,50));

        var productService = new ProductService();
        System.out.println(productService.fiendProduct());
        System.out.println(productService.minProductPrice());
        System.out.println(productService.maxProductPrice());

    }
}
