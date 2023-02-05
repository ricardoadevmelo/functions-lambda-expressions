package services;

import entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filteredSum(List<Product> productList, Predicate<Product> criteria) {
        double sum = 0.0;
        for (Product product : productList) {
            if (criteria.test(product)) {
                sum += product.getPrice();
            }
        }
        return sum;
    }

    /*
    METHOD1:

    public double filteredSum(List<Product> productList) {
        double sum = 0.0;
        for (Product product : productList) {
            if (product.getName().charAt(0) == 'T') {
                sum += product.getPrice();
            }
        }
        return sum;
    }
     */
}
