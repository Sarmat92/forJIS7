package JavaHomework.Lectures_10.Collections.Shop.Service;

import JavaHomework.Lectures_10.Collections.Shop.Model.Product;
import static JavaHomework.Lectures_10.Collections.Shop.Repository.Shop.*;

public class ShopServiceImplementation implements ShopService {

    @Override
    public void addProduct(Product product) {
        getProductList().add(product);
    }

    @Override
    public void deleteProduct(int productForDelete) {
        getProductList().remove(productForDelete);
    }

    @Override
    public void showAllProduct() {
        for (Product productEach:getProductList()) {
            System.out.println(productEach);
        }
    }

    @Override
    public String fiendProductByName(String productName) {
        boolean isFound = false;
        for (Product productEach:getProductList()) {
            if (productEach.getProductName().equals(productName)){
                System.out.println(productEach.getProductName() + " " +productEach.getProductCost());
                isFound = true;
            }
        }
        if (!isFound){
            System.out.println("Product is not found. Add your product to shopping cart.");
        }
        return null;
    }
}
