package entities;

public class Product {

    private String name;
    private Double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = Double.valueOf(price);
    }

//    METHOD2
//    public static boolean staticProductPredicate(Product product) {
//        return product.getPrice() >= 100.0;
//    }

    //    METHOD3
    public boolean nonStaticProductPredicate() {
        return price >= 100.0;
    }

    @Override
    public String toString() {
        return "Product: "
                + "name: "
                + name
                + ", price = " + String.format("$%.2f", price);
    }
}
