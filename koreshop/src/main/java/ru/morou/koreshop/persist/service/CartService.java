package ru.morou.koreshop.persist.service;

import java.util.List;

import ru.morou.koreshop.persist.model.Product;

/**
 * CartService
 */
public interface CartService {

    void addItem(Long id);

    void removeItem(Long id);

    List<Product> getAllItems();

    int getItemCount();

    void clearCart();

    
}