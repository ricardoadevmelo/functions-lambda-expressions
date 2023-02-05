package application;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class ProductProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Tv", 900.00));
        productList.add(new Product("Mouse", 50.00));
        productList.add(new Product("Tablet", 350.50));
        productList.add(new Product("HD Case", 80.90));

//        productList.forEach(new PriceUpdate()); METHOD1
//        productList.forEach(Product :: staticPriceUpdate); METHOD2
//        productList.forEach(Product::nonStaticPriceUpdate); METHOD3
//        Consumer<Product> consumer = product -> {product.setPrice(product.getPrice() * 1.1);}; METHOD4
        double factor = 1.1;
//        Consumer<Product> consumer = product -> product.setPrice(product.getPrice() * factor); METHOD5
//        productList.forEach(consumer); METHOD5.1

//        Consumer<Product> consumer = product -> product.setPrice(product.getPrice() * factor); //METHOD6

//        METHOD7: Inline lambda expression
        productList.forEach(product -> product.setPrice(product.getPrice() * factor));
        productList.forEach(System.out::println);



    }
}