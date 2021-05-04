package JavaHomework.Lectures_10.Collections.Shop;

import JavaHomework.Lectures_10.Collections.Shop.Model.Product;
import JavaHomework.Lectures_10.Collections.Shop.Service.ShopServiceImplementation;

public class ShopDemo {

    public static void main(String[] args) {

        var shop = new ShopServiceImplementation();
        shop.addProduct(new Product("Milk",1.25));
        shop.addProduct(new Product("Bread",0.18));
        shop.addProduct(new Product("Tee",2.25));
        shop.addProduct(new Product("Coffee",2.87));

        shop.showAllProduct();
        shop.fiendProductByName("Milk");
        shop.fiendProductByName("Bear");

    }
}
