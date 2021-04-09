package JavaHomework.Lectures_6.Objects.Product;

public class Product {

    private String name;
    private double regularPrice;
    private double discount;

    public Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", regularPrice=" + regularPrice +
                ", discount=" + discount +
                '}';
    }

    public double actualPrice() {
        double priceWithsDiscount = getRegularPrice() - (getRegularPrice() / 100 * getDiscount());
        return priceWithsDiscount;
    }

    public void information() {
        System.out.println("name: " + getName() + " "
                + "regular price: " + getRegularPrice() + "$" + " "
                + "discount: " + getDiscount() + "%" + " "
                + "actual price: " + actualPrice() + "$");
    }
}
