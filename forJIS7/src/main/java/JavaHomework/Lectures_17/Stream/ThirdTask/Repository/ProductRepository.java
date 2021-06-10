package JavaHomework.Lectures_17.Stream.ThirdTask.Repository;

import JavaHomework.Lectures_17.Stream.ThirdTask.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    public static List<Product> productList = new ArrayList<>();

    public static void initializeProductList() {
        productList.add(new Product("Milk", 25.99, 45));
        productList.add(new Product("Coffee", 15.99, 0));
        productList.add(new Product("Tee", 2.99, 0));
        productList.add(new Product("Bread", 8.99, 50));
        productList.add(new Product("Beer", 1.99, 10));
        productList.add(new Product("Potato", 0.99, 5));
    }
}
