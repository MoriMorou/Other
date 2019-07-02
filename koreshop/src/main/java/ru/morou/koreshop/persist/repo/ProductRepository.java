package ru.morou.koreshop.persist.repo;

import ru.morou.koreshop.persist.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * GoodRepository
 */
public interface ProductRepository extends JpaRepository<Product, Long>{

    
}