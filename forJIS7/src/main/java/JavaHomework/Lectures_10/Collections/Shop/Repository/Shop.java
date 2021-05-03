package JavaHomework.Lectures_10.Collections.Shop.Repository;

import JavaHomework.Lectures_10.Collections.Shop.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private static List<Product> productList = new ArrayList<>();

    public static List<Product> getProductList() {
        return productList;
    }

    public static void setProductList(List<Product> productList) {
        Shop.productList = productList;
    }
}
