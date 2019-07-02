package ru.morou.koreshop.persist.repo;

import ru.morou.koreshop.persist.model.ProductBrand;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * GoodsBrandRepository
 */
public interface ProductBrandRepository extends JpaRepository<ProductBrand, Long> {

    ProductBrand findByName(String name);
}
