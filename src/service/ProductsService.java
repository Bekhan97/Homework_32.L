package service;

import model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductsService {
    private List<Product> products;

    public ProductsService(List<Product> products) {
        if (products == null) {
            this.products = new ArrayList<>();
        } else {
            this.products = new ArrayList<>(products);
        }
    }

    public List<Product> getSortedProductList(Comparator<Product> comparator) {
        ArrayList<Product> newArrayList = new ArrayList<>(products);
        newArrayList.sort(comparator);
        return newArrayList;
    }

    public ProductsService() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public String toString() {
        return "ProductsService{" +
                "products=" + products +
                '}';
    }
}
