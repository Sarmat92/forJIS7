package JavaHomework.Lectures_17.Stream.ThirdTask.ProductService;

import JavaHomework.Lectures_17.Stream.ThirdTask.Model.Product;

import java.util.List;

public interface Service {

    List<Product> fiendProduct ();

    List<Product> maxProductPrice();

    List<Product> minProductPrice();
}
