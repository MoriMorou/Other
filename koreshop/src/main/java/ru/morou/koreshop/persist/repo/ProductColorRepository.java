package ru.morou.koreshop.persist.repo;

import ru.morou.koreshop.persist.model.ProductColor;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * GoodsColorRepository
 */
public interface ProductColorRepository extends JpaRepository<ProductColor, Long> {

    ProductColor findByName(String name);
}