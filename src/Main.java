import model.Product;
import service.ProductsService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Product> products = List.of(
                new Product("Laptop", 1325, 4.5, 26),
                new Product("Smartphone", 923, 4.9, 110),
                new Product("Headphones", 385, 4.8, 23),
                new Product("TV", 2246, 5.0, 10),
                new Product("Fridge", 894, 3.7, 6)
        );
        ProductsService productsService = new ProductsService(products);

        System.out.println("Choose an option:");
        System.out.println("0. Don't sort!");
        System.out.println("1. Sort by Price");
        System.out.println("2. Sort by Name");
        System.out.println("3. Sort by Rating");
        System.out.println("4. Sort by Stock");
        int select = scanner.nextInt();

        Comparator<Product> comparator = switch (select) {
            case 0 -> new ZeroComparator();
            case 1 -> new ComparatorProductByPrice();
            case 2 -> new ComparatorProductByName();
            case 3 -> new ComparatorProductByRating();
            case 4 -> new ComparatorProductByStock();
            default -> new ZeroComparator();
        };

        System.out.println("1. Sort Up; 2. Sort Down");
        select = scanner.nextInt();
        if (select == 2) {
            comparator = comparator.reversed();
        }


        List<Product> sortedProductList = productsService.getSortedProductList(new ComparatorProductByName());
        System.out.println(sortedProductList);

    }
}