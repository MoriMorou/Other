package ru.morou.koreshop.persist.service;

import java.util.List;

import ru.morou.koreshop.persist.model.ProductBrand;
import ru.morou.koreshop.persist.repo.ProductBrandRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProductBrandServiceImp
 */
@Service
public class ProductBrandServiceImp implements ProductBrandService {

    @Autowired
    private ProductBrandRepository productBrandRepository;

    @Override
    public ProductBrand findById(Long id) {
        return productBrandRepository.findById(id).get();
    }

    @Override
    public List<ProductBrand> findAll() {
        return productBrandRepository.findAll();
    }

    @Override
    public boolean save(ProductBrand e) {
        productBrandRepository.save(e);
        return true;
    }

    @Override
    public boolean deleteById(Long id) {
        productBrandRepository.deleteById(id);
        return true;
    }

    
}