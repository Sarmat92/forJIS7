package JavaHomework.Lectures_10.Collections.Shop.Service;

import JavaHomework.Lectures_10.Collections.Shop.Model.Product;

public interface ShopService {

    void addProduct(Product product);

    void deleteProduct(Product product);

    void showAllProduct();

    Object fiendProductByName(String productName);

}
