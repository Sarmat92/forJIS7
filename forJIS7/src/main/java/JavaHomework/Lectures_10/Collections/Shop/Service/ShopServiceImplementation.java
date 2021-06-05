package JavaHomework.Lectures_10.Collections.Shop.Service;

import JavaHomework.Lectures_10.Collections.Shop.Exceptions.ProductValidateExceptions;
import JavaHomework.Lectures_10.Collections.Shop.Model.Product;
import ch.qos.logback.core.html.IThrowableRenderer;

import static JavaHomework.Lectures_10.Collections.Shop.Repository.Shop.*;

public class ShopServiceImplementation implements ShopService {


    @Override
    public void addProduct(Product product) {
        getProductList().add(product);
    }

    @Override
    public void deleteProduct(Product product) {
        getProductList().remove(product);
    }

    @Override
    public void showAllProduct() {
        for (Product productEach:getProductList()) {
            System.out.println(productEach);
        }
    }

    @Override
    public Product fiendProductByName(String productName) throws ProductValidateExceptions {

        // проверяем list на наличие продукта с нужным именем;
        for (Product productEach:getProductList())  {
            if (productEach.getProductName().equals(productName)){

                //если найдено, возвращаем этот объект;
                System.out.println(productEach);
                return productEach;
            }
        }
        // если не найдено, бросить исключение с сообщением;
       throw new ProductValidateExceptions(productName +" " + "Product not found.");
    }
}
