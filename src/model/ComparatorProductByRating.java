package model;

import java.util.Comparator;

public class ComparatorProductByRating implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getRating(), o2.getRating());
    }
}
