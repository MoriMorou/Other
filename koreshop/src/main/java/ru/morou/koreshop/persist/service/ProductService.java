package ru.morou.koreshop.persist.service;

import ru.morou.koreshop.persist.model.Product;

/**
 * ProductService
 */
public interface ProductService extends CommonCrudInterface<Product> {  

    boolean deleteProductPicture(Long id, Product product);
}