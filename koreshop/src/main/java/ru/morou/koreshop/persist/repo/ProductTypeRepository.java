package ru.morou.koreshop.persist.repo;

import ru.morou.koreshop.persist.model.ProductType;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * GoodsTypeRepository
 */
public interface ProductTypeRepository extends JpaRepository<ProductType, Long> {

    ProductType findByName(String name);
}