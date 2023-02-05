package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class ProductProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Tv", 900.00));
        productList.add(new Product("Mouse", 50.00));
        productList.add(new Product("Tablet", 350.50));
        productList.add(new Product("HD Case", 80.90));

//        productList.removeIf(new ProductPredicate()); METHOD1
//        productList.removeIf(Product :: staticProductPredicate); METHOD2
//        productList.removeIf(Product ::nonStaticProductPredicate); METHOD3
//        Predicate<Product> productPredicate = product -> product.getPrice() >= 100.0; METHOD4
        double min = 100.00;
//        Predicate<Product> productPredicate = product -> product.getPrice() >= min; METHOD5

        productList.removeIf(product -> product.getPrice() >= min); // METHOD6

        for (Product product : productList) {
            System.out.println(product);
        }







    }

}