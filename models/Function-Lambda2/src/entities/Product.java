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

    public void setPrice(double price) {
        this.price = Double.valueOf(price);
    }

//    METHOD2
//    public static void staticPriceUpdate(Product product) {
//        product.setPrice(product.getPrice());
//    }

//      METHOD3
        public void nonStaticPriceUpdate() {
        setPrice(getPrice() * 1.1);
    }

    @Override
    public String toString() {
        return "Product: "
                + name
                + ", price = " + String.format("$%.2f", price);
    }
}
