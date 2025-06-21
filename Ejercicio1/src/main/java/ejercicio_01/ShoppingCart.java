/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jacks
 */
public class ShoppingCart {
    private List<Double> productPrices;

    public ShoppingCart() {
        this.productPrices = new ArrayList<>();
    }

    public void addProduct(double price) {
        if (price <= 0) throw new IllegalArgumentException("Price must be positive");
        productPrices.add(price);
    }

    public void removeProduct(double price) {
        productPrices.remove(price); 
    }

    public double getTotal() {
        double total = 0;
        for (double price : productPrices) {
            total += price;
        }
        return total;
    }

    public int getProductCount() {
        return productPrices.size();
    }
}
