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

//    METHOD2: reference with static method
//    public static String staticUpperCaseName(Product product) {
//        return product.getName().toUpperCase();
//    }

//    METHOD3: reference with non static method
    public String nonStaticUpperCaseName() {
        return name.toUpperCase();
    }


    @Override
    public String toString() {
        return "Product: "
                + "name: "
                + name
                + ", price = " + String.format("$%.2f", price);
    }
}
