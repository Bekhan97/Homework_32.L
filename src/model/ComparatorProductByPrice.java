package model;

import java.util.Comparator;

public class ComparatorProductByPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());

        /*
        if (o1.getPrice() > o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() < o2.getPrice()) {
            return -1;
        } else {
            return 0;
        }   */
    }
}
/*
int - integer
double - Double
boolean - Boolean
*/
