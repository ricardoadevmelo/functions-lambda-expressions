package application;

import entities.Product;
import services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ProductProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Tv", 900.00));
        productList.add(new Product("Mouse", 50.00));
        productList.add(new Product("Tablet", 350.50));
        productList.add(new Product("HD Case", 80.90));

//        List<String> names = productList.stream().map(new UperCaseName()).collect(Collectors.toList()); METHOD1: interface implementation
//        List<String> names = productList.stream().map(Product :: staticUpperCaseName).collect(Collectors.toList()); METHOD2: reference with static method
//        List<String> names = productList.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList()); METHOD3: reference with non static method
//        Function <Product, String> function = product -> product.getName().toUpperCase();
//        List<String> names = productList.stream().map(function).collect(Collectors.toList()); METHOD4: declared lambda expression

        ProductService productService = new ProductService();

//        double sum = productService.filteredSum(productList); METHOD1

        double sum = productService.filteredSum(productList, product -> product.getPrice() < 100.00);

        System.out.printf("Sum = %.2f", sum);

    }
}