package JavaHomework.Lectures_17.Stream.ThirdTask.Repository;

import JavaHomework.Lectures_17.Stream.ThirdTask.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    public static List<Product> productList = new ArrayList<>();

    public static void initializeProductList() {

        productList = List.of(
                new Product("Milk",25.99,45),
                new Product("Coffee", 15.99, 0),
                new Product("Tee", 2.99, 0),
                new Product("Bread", 8.99, 50),
                new Product("Beer", 1.99, 10),
                new Product("Potato", 0.99, 5)
        );



    }
}
