package ru.morou.koreshop.persist.service;

import java.util.List;

import ru.morou.koreshop.persist.model.ProductType;
import ru.morou.koreshop.persist.repo.ProductTypeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProductTypeServiceImpl
 */
@Service
public class ProductTypeServiceImpl implements ProductTypeService {
    
    @Autowired
    private ProductTypeRepository productTypeRepository;

    @Override
    public ProductType findById(Long id) {
        return productTypeRepository.findById(id).get();
    }

    @Override
    public List<ProductType> findAll() {
        return productTypeRepository.findAll();
    }

    @Override
    public boolean save(ProductType e) {
        productTypeRepository.save(e);
        return true;
    }

    @Override
    public boolean deleteById(Long id) {
        productTypeRepository.deleteById(id);
        return true;
    }

    
}