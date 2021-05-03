package JavaHomework.Lectures_10.Collections.Shop.Service;

import JavaHomework.Lectures_10.Collections.Shop.Model.Product;

public interface ShopService {

    void addProduct(Product product);

    void deleteProduct(int productForDelete);

    void showAllProduct();

    void fiendProductByName(String productName);

}
